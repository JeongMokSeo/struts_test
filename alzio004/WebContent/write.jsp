<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인</h2>
<form action="loginCheck2.action" name="loginFrm" method="post">
<table cellspacing="10">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="id" /></td>
	</tr> 
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="pwd" /></td>
	</tr> 
	<tr>
		<td colspan="2"> <input type="submit" value="확인" /></td>
	</tr>
</table>
---------------------------------에러메시지<br>
<s:actionerror />

</form>
</body>
</html>