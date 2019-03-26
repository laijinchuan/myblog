<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功</title>
</head>
<body>
	<c:if test="${isSuccess}" var="result">
		<h1>登陆成功</h1>
		<h1><a href="${pageContext.request.contextPath}/view/update.action?">修改</a></h1>
	</c:if>
	<c:if test="${not result}">
		<h1>登陆失败</h1>
	</c:if>
	
	
	
</body>
</html>