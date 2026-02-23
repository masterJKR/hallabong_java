package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import dao.*;
import dto.*;


@WebServlet("/modifyMenu.do")
@MultipartConfig
public class ModifyMenuServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModifyMenuServlet() {
		// TODO Auto-generated constructor stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		boolean result = MenuDAO.update( new MenuDTO(
				Long.parseLong(request.getParameter("id")), request.getParameter("menuName"),
				"", Integer.parseInt(request.getParameter("price")), request.getParameter("category")));
		
		if(result) {
			response.getWriter().print("success");
		} else {
			response.getWriter().print("fail");
		}
	}
}
