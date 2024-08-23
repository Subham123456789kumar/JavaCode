package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Register  extends HttpServlet{
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		
		
	String name=req.getParameter("name1");
	String email=req.getParameter("email1");
	String password=req.getParameter("pass1");
	String gender=req.getParameter("gender1");
	String city=req.getParameter("city1");
	
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo" ,"root","komal123");
		PreparedStatement ps =con.prepareStatement("insert into register1 value(?,?,?,?,?)"); 
		
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city);
		
	    int conunt=ps.executeUpdate();
	    
	    
	    if (conunt>0) {
	    	resp.setContentType("text/html");
	    	
	    	out.print("<h3 style='color:green'>register successfully </h3>");
	    	
	    	RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
	    	rd.include(req, resp);
			
		} else {
			
			
            resp.setContentType("text/html");
	    	
	    	out.print("<h3 style='color:red'> not register successfully </h3>");
	    	
	    	
	    	RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
	    	rd.include(req, resp);
	    	

		}
		
		
		
	} catch (Exception e) {
		
		
		    resp.setContentType("text/html");
	    	
	    	out.print("<h3 style='color:red'> Exceptoion"+e.getMessage()+"</h3>");
		
		
	}

		
	}
	
	

}
