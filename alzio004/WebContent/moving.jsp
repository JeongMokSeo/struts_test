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
	String p1 = request.getParameter("id");
	String p2 = request.getParameter("pwd");

%>

전달된 두 가지 데이터를 확인해 봅시다.<br>
<%=p1 %><br>
<%=p2 %><br>
</body>
</html>