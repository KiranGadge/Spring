<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1 align ="center">Welcome</h1>
<h2 align="center"><i>Online Tuition Application</i></h2>
<h3 align="center"><a href='index'>Course Book</a></h3>
	<table border=1 align="center">
		<tr>
			<th>Course Id</th>
			<th>Course Name</th>
			<th>No of Students</th>
		</tr>
		<c:forEach var="cobj" items="${courses_list}">
		<tr>
		<td>${cobj.getCourse_id()}</td>
		<td>${cobj.getCourse_name()}</td>
		<td>${cobj.getStudents()}</td>
		</tr>
		</c:forEach>
</body>
</html>