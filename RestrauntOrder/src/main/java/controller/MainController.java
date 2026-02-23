package controller;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import dao.*;
import dto.*;

@WebServlet("*.do")
@MultipartConfig
public class MainController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String path = request.getServletPath();
		
		if (path.equals("/addMenu.do")) {
			Part filePart = request.getPart("menuImg");

			String fileName = filePart.getSubmittedFileName();
			
			System.out.println("fileName : " + fileName);
			String savePath = request.getServletContext().getRealPath("/resources/img");

			// 2. 경로 끝에 구분자가 있는지 확인하고 파일 객체 생성
			File uploadDir = new File(savePath);
			if (!uploadDir.exists()) uploadDir.mkdirs(); // 폴더가 없으면 생성

			// 3. 파일 이름 앞에 확실하게 구분자 추가
			String fullPath = savePath + File.separator + fileName;
			filePart.write(fullPath);

			System.out.println("저장된 전체 경로 : " + fullPath);
			
			boolean result = MenuDAO.insert(new MenuDTO(
					0, request.getParameter("menuName"),
					String.format("./resources/img/%s", fileName) ,
					Integer.parseInt(request.getParameter("price")),
					request.getParameter("category")));
			
			if(result) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		} else if (path.equals("/modifyMenu.do")) {
			boolean result = MenuDAO.update( new MenuDTO(
					Long.parseLong(request.getParameter("id")),
					request.getParameter("menuName"), "",
					Integer.parseInt(request.getParameter("price")),
					request.getParameter("category")));
			
			if(result) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		} else if (path.equals("/deleteMenu.do")) {
			boolean result = MenuDAO.delete(
					Long.parseLong(request.getParameter("id")));

			if(result) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}
		} else if (path.equals("/getAdminData.do")) {
			String menuJson = MenuDAO.getListAsJson();
			String orderJson = OrderDAO.getListAsJson();
			
			String result = String.format(
					"{\"menuList\" : %s, \"orderList\" : %s}", menuJson, orderJson);
			
			System.out.println(result);
			response.setContentType("application/json; charset=UTF-8");
			response.getWriter().print(result);
		} else if (path.equals("/getMenuData.do")) {
			String menuJson = MenuDAO.getListAsJson();
			
			String result = String.format("{\"menuList\": %s}", menuJson);
			System.out.println(result);
			
			response.setContentType("application/json; charset=UTF-8");
			response.getWriter().print(result);
		}
	}
}
