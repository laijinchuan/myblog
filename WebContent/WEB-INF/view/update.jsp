<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户显示</title>
<script type="text/javascript" src="<%=contextPath %>/view/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	 $(document).ready(function(){
		$("button").click(function(){
			$.post("${pageContext.request.contextPath}/view/updateUser.action",
					{
						password:$("#password").val()
					},
					function(status){
						alter(status);
			});
		});
	}); 
</script>
</head>
<body>
<input value="${userList.username} "/>
<input type="text" id="password">
<a href="${pageContext.request.contextPath}/view/updateUser.action">提交</a>
<button>提交</button>
</body>
</html>