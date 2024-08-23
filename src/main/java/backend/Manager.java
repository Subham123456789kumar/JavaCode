package backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/manager")
public class Manager extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	String rate=req.getParameter("rate");
	
	
	System.out.println(rate);
	
	HttpSession session=req.getSession();
	session.setAttribute("session_rate", rate);
	
	RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
	rd.include(req, resp);
	
	
		
		
		
		
	}
	
	
	

}
