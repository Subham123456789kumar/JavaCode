package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/managerlogin")
public class ManagerLogin  extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	PrintWriter out= resp.getWriter();	
		
		
	String email=req.getParameter("email1");
	String password=req.getParameter("pass1");
	
	
	System.out.println(email);
	System.out.println(password);
	
	String em= email;
	String ps=password;
	
	
	
	 if (em.contentEquals("manojkumar@gmail.com") && ps.contentEquals("1234")) {
		
		
		
		
	 
	
	
	
	
	// data base fatching
	
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo" ,"root","komal123");
		PreparedStatement ps1 =con.prepareStatement("select * from datetime1"); 
		
		
		
	    ResultSet rs = ps1.executeQuery();
	    
	    

		
		System.out.println(rs);
	    
	    
	    while (rs.next()) {
	    	  	
	    	
	    	
	    	
	    	
	    	
	    	
	    	HttpSession session= req.getSession();
	    	
	    	session .setAttribute("session_name","Rahul");
	    	
	    	session.setAttribute("session_date", rs.getString("date"));
	    	session.setAttribute("session_work1", rs.getString("10to12work"));
	    	session.setAttribute("session_work2", rs.getString("12to2work"));
	    	session.setAttribute("session_work3", rs.getString("2to4work"));
    	
	
	    	
	    	RequestDispatcher rd = req.getRequestDispatcher("manager.jsp");
			rd.include(req, resp);
	    	
	    	
	    	
	    	
			
		}
		
		
	} catch (Exception e) {
		
		
		    resp.setContentType("text/html");
	    	
	    	out.print("<h3 style='color:red'> Exceptoion"+e.getMessage()+"</h3>");
		
		
	}

		
	
	 }
	
	 
	 else {
		resp.setContentType("text/html");
		
		out.print("<h3 style='color:red'>Invalied user<h3>");
		
		RequestDispatcher rd = req.getRequestDispatcher("managerlogin.jsp");
		rd.include(req, resp);
	
	}

	
	
	
	
		
		
		
		
		
	}


}
