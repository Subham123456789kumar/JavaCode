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
@WebServlet("/datetime")
public class DateTime extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		

		
		PrintWriter out= resp.getWriter();
		
		
		String date=req.getParameter("date1");
		String work1=req.getParameter("work1");
		String work2=req.getParameter("work2");
		String work3=req.getParameter("work3");
		
		
		
		System.out.println(date);
		//System.out.println(time);
		//System.out.println(work);

		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo" ,"root","komal123");
			PreparedStatement ps =con.prepareStatement("insert into datetime1 value(?,?,?,?)"); 
			
		    ps.setString(1, date);
		    ps.setString(2, work1);
		    ps.setString(3, work2);
		    ps.setString(4, work3);
		    
			
		   
            int cont=ps.executeUpdate();
			
			
		    
		    
		    if (cont>0) {
		    	
		    	
		    	resp.setContentType("text/html");
		    	
		    	out.print("<h3 style='color:green'>thanks. you are successfully submited</h3>");
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
		        rd.include(req, resp);
				
			} else {
				
				
	            resp.setContentType("text/html");
		    	
		    	out.print("<h3 style='color:red'>not submited</h3>");
		    	
		    	
		    	
		    	

			}
			
			
			
		} catch (Exception e) {
			
			
			    resp.setContentType("text/html");
		    	
		    	out.print("<h3 style='color:red'> Exceptoion"+e.getMessage()+"</h3>");
			
			
		}

			
		
		
		
		
		
		
		
	}
	
	
	
	

}
