<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지입니다.</title>
<style type="text/css">
.title { background-color: #ffffff;}
tr { background-color: #ffffff;}
body  { background-color: #ffffff;}
</style>
</head>
<body>
<form action="login.action" method="post">
	<table style="font-family: 맑은 고딕; height:50;" align="center" border="0" bgcolor="#ffffff">
		<tr class="title">
			<td align="left"><img src="/web/image/logo.bmp"></td>
			<td align="center" width="500">
				<font size="10">Web</font>
			</td>
		</tr>
	</table>
	
	<table style="font-family: 맑은 고딕; height:50;" align="center" border="0" bgcolor="#ffffff">
		<tr height="20">
			<td align="center">아이디</td>
			<td><input type="text" name="id"  style="height:22px; width:100px"></td>
		</tr>
		<tr height="20">
			<td align="center">비밀번호</td>
			<td><input type="password" name="password"  style="height:22px; width:100px"></td>
		</tr>
		<tr height="10">
			<td align="center" colspan="2"></td>
		</tr>
		<tr height="10">
			<td align="center" colspan="2">
				<input type="submit" value="로그인" />
			</td>
		</tr>
	</table>

</form>

</body>
</html>