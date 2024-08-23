<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>manager  feedback</h1>

 Name:<h1>${session_name}</h1>

<h1>${session_date}</h1>
10 to 12<h1>${session_work1}</h1>
12 to 2 :<h1>${session_work2}</h1>
2 to 4<h1>${session_work3}</h1>

<form action="manager" method="post">

 rating :<input type="radio"  name="rate" value="1">1
         <input type="radio"  name="rate" value="2">2
         <input type="radio"  name="rate" value="3">3
         <input type="radio"  name="rate" value="4">4
         <input type="radio"  name="rate" value="5">5
         
         
         <input type="submit" name="submit">


</form>


</body>
</html>