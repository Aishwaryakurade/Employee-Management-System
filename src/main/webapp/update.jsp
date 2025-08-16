<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="updateEmp">             

<input type="text" name="id"  placeholder="Enter your id:"  value="${emp.id }">
<input type="text" name="name"  placeholder="Enter your name:"  value="${emp.name }"    >
<input type="text" name="sal"  placeholder="Enter your sal:" value="${emp.sal }">
<button>Submit</button>
</form>

</body>
</html>