<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue" align="center">


	<c:if test="${empty courses}">
		<h1>Add Courses</h1>
		<form action="add" method="get">
	</c:if>

	Course id:-
	<input type="text" name="courseid" value="${courses.getCourse_id()}">
	<br /> Course Name :-
	<input type='text' name="coursename" value="${book.getCourse_name()}">
	<br /> No of Students:-
	<input type='text' name="No_Students" value="${book.getStudents()}">
	<br />

</body>
</html>