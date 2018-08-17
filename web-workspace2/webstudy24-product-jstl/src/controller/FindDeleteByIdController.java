package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductDTO;

public class FindDeleteByIdController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pno=request.getParameter("pno");			
		ProductDAO.getInstance().findDeleteById(pno);
		
		
		return "redirect:index.jsp";
		
	}

}
