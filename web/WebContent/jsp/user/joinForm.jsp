<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.title { background-color: #ffffff;}
tr { background-color: #ffffff;}
body  { background-color: #ffffff;}
</style>
</head>
<body>
<form action="join.action" method="post">
	<table style="font-family: 맑은 고딕; height:50;" align="center" border="0" bgcolor="#ffffff" cellpadding="0" cellspacing="0">
		<tr >
			<td align="left"><img src="/web/image/logo.jpg"></td>
			<td align="center" width="500"><font size="10">Web</font></td>
		</tr>
		<tr>
			<td align="left"></td>
			<td align="center" width="500"><font size="5">회원가입 페이지</font></td>
		</tr>
	</table>
	
	<table style="font-family: 맑은 고딕; height:50;" align="center" border="0" bgcolor="#ffffff" cellpadding="0" cellspacing="0">
		<tr height="20">
			<td align="left" colspan="2" height="20"></td>
		</tr>
		<tr>
			<td align="center" >아이디</td>
			<td style="margin-left: 5" ><input type="text" name="id" style="height: 22px; width: 200px;"></td>
		</tr>
		<tr>
			<td align="center" >비밀번호</td>
			<td style="margin-left: 5" ><input type="password" name="password" style="height: 22px; width: 200px;"></td>
		</tr>
		<tr>
			<td align="center" ><font size="2">비밀번호 확인</font></td>
			<td style="margin-left: 5" ><input type="password" name="passwordconfirm" style="height: 22px; width: 200px;"></td>
		</tr>
		<tr>
			<td align="center" >이름</td>
			<td style="margin-left: 5" ><input type="text" name="name" style="height: 22px; width: 200px;"></td>
		</tr>
		<tr>
			<td align="center" >이메일</td>
			<td style="margin-left: 5" ><input type="text" name="email" style="height: 22px; width: 200px;"></td>
		</tr>
		<tr height="30">
			<td align="left" colspan="2" ></td>
		</tr>
		<tr height="30">
			<td align="left" colspan="2" height="30">
				<input type="submit" value="회원가입" />
				<input type="button" value="뒤로가기"  onClick="location.href='login.action'"/>
			</td>
		</tr>
	</table>

</form>

</body>
</html>