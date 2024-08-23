<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Register page</h1>

<form action="register" method="post">

Name :<input type="text" name="name1"><br><br>
Email :<input type="text" name="email1"><br><br>
Password :<input type="text" name="pass1"><br><br>
Gender :<input type="radio" name="gender1" value="male">male
        <input type="radio" name="gender1" value="female">female<br><br>
        
City : <select name="city1">

<option>Bihar</option>
<option>Jharkhand</option>
<option>Delhi</option>
<option>Up</option>



      </select><br><br>
      
      
      <input type="submit" value="submit">

      <a href="login.jsp">login</a>


</form>




</body>
</html>