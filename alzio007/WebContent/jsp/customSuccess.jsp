<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사 결과 페이지</title>
</head>
<body>
<center>
	<h2>고객 정보 입력</h2>
	<br>
	<b>${name }님 환영합니다.</b>
	<br>
		String Length Validator : ${name }<br>
		required Validator : ${pwd }<br>
		Field Expression Validator : ${pwdchk }<br>
		URL Validator : ${hpage }<br>
		Regex Validator : ${pic }<br>
</center>

</body>
</html>