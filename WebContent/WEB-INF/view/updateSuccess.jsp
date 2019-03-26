<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改成功</title>
</head>
<body>
<c:if test="${isSuccess==1}">
	<h1>成功</h1>
</c:if>
<c:if test="${isSuccess}==0">
	<h1>失败</h1>
</c:if>
<h2>asda</h2>
</body>
</html>