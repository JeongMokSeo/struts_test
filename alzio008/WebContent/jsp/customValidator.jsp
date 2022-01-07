<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유효성 검사 페이지</title>
</head>
<body>
<center>
<s:form action="CustomValidatorAction" >
	<s:textfield  label="이름" name="requiredValidator"/>
	<s:textfield  label="주민번호" name="customValidator"/>
	<s:submit />
</s:form>

유효성 검사 오류 <br>
<s:fielderror />
<hr>
</center>
</body>
</html>