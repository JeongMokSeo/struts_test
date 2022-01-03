<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String pp1 = request.getParameter("id");
	String pp2 = request.getParameter("pwd");

%>

전달된 두 가지 데이터를 확인해 봅시다.<br><hr>
<%=pp1 %><br>
<%=pp2 %><br>
</body>
</html>