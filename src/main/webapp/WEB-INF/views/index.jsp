<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" type="text/css" media="all" href="../main/resources/css/bootstrap.min.css" />

    <script type="text/javascript"  src="main/resources/js/jquery.min.js"></script>
    <script type="text/javascript"  src="main/resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person Management Screen</title>
</head>
<body>

	<div class="container" >
		<h1>Person List</h1>
		
		<table class="table" border="1">
<tr>

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>
				<th>Telephone</th>
			<th>Action</th>
			<th>Telephone</th>
			</tr>
	<c:forEach items="${persons}" var="person">
  <c:url var="editUrl" value="/krams/main/record/edit?id=${person.id}" />
  <c:url var="deleteUrl" value="/krams/main/record/delete?id=${person.id}" />
   
  <c:if test="${!empty user.post}">
   <c:forEach items="${user.post}" var="postList">
   <tr>
    <td><c:out value="${user.id}" /></td>
    <td><c:out value="${user.username}" /></td>
    <td><c:out value="${user.password}" /></td>
     
    <td><c:out value="${post.id}" /></td>
    <td><c:out value="${post.postname}" /></td>
    <td><c:out value="${post.postexp}" /></td>
    <td><c:out value="${post.postdate}" /></td>
    <td><c:out value="${post.postcategories}" /></td>
  
   </tr>
   </c:forEach>
  </c:if>
   
 </c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	
	</div>
</body>
</html>