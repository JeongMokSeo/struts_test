<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보</h1>
<form action="join/join.action" name="join" method="post" >
	아이디: <s:textfield name="id" size="10" maxlength="8" /><br>
	이름: <s:textfield name="name" size="10" maxlength="6" /><br>
	전화번호: <s:textfield name="tel" size="17" maxlength="15" /><br>
	<input type="submit" value="회원가입">
	<input type="reset" value="취소">
</form>
</body>
</html>