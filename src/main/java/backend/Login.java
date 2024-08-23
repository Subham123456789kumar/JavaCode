package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		
		PrintWriter out= resp.getWriter();
		
		
		String email=req.getParameter("email1");
		String password=req.getParameter("pass1");
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo" ,"root","komal123");
			PreparedStatement ps =con.prepareStatement("select * from register1 where email=? and password=? "); 
			
			ps.setString(1, email);
			ps.setString(2, password);
			
		   ResultSet rs = ps.executeQuery();

			
			
		    
		    
		    if (rs.next()) {
		    	
		    	
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		    	rd.include(req, resp);
				
			} else {
				
				
	            resp.setContentType("text/html");
		    	
		    	out.print("<h3 style='color:red'>invalid user </h3>");
		    	
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		    	rd.include(req, resp);
		    	

			}
			
			
			
		} catch (Exception e) {
			
			
			    resp.setContentType("text/html");
		    	
		    	out.print("<h3 style='color:red'> Exceptoion"+e.getMessage()+"</h3>");
			
			
		}

			
		
		
		
		
		
	}
	
	
	

}
