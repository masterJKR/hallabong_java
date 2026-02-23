package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import dao.*;
import dto.*;

@WebServlet("/addMenu.do")
@MultipartConfig
public class AddMenuServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddMenuServlet() {
		// TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Part filePart = request.getPart("menuImg");
		String fileName = filePart.getSubmittedFileName();
		
		String savePath = request.getServletContext().getRealPath("/resources/img");
		filePart.write(savePath + "/" + fileName);
		
		boolean result = MenuDAO.insert(new MenuDTO(
				0, request.getParameter("menuName"),
				"./resources/img/" + fileName , Integer.parseInt(request.getParameter("price")), request.getParameter("category")));
		
		if(result) {
			response.getWriter().print("success");
		} else {
			response.getWriter().print("fail");
		}
	}
}
