<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>TimeSheet</h1>

<form action="datetime" method="post">


 Date:<input type="date" name="date1" ><br><br>
 <%-- 
 
 Time :<input type="time" name="time1" placeholder="Enter time"><br><br>
 
 --%>
 
 
 Work :10 to 12
 <textarea rows="5px" cols="20px" name="work1"></textarea><br><br>
 
 Work :12 to 2
 <textarea rows="5px" cols="20px" name="work2"></textarea><br><br>
 
 Work :2 to 4
 <textarea rows="5px" cols="20px" name="work3"></textarea><br><br>
 
   <input type="submit" value="submit">


</form>




</body>
</html>