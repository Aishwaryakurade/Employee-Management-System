<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3 style="color: red">${msg }</h3>

<table>

          <thead>
               <tr>
                 <th>id</th>
                 <th>name</th>
                 <th>salary</th>
                 <th>Action</th>
               </tr>
          </thead>
          <tbody>
               <c:forEach var="emp"  items="${list }">
          
                 <tr>
                    <td>${emp.id }</td>
                    <td>${emp.name }</td>
                    <td>${emp.sal }</td>
                    <td><a href="deleteById?id=${emp.id }"><button>Delete</button></a></td>
                    <td><a href="updateEmpPage?id=${emp.id }"><button>Update</button></a></td>
                 </tr>
               </c:forEach>
          
         </tbody>

</table>



</body>
</html>