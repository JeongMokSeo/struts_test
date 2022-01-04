<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td {font-family: 맑은 고딕;  font-size: 10pt; background-color: #cccccc;}
	.myStyle {font-family: 궁서체; font-size: 15pt; padding: 0 auto;}
	table { border: 1px solid black; padding:  0 auto; background-color: #f3f3f3;}
</style>
</head>
<body>
<br>
<font class="myStyle">회원정보</font><br>

<form name="JoinFrm" action="joinMember.action" method="post" >
	<table border="1" cellspacing="0" bordercolor="#f3f3f3">
		<tr>
			<td width="100">이름</td>
			<td width="300"><input type="text" name="name" size="15" maxlength="10" /></td>
		</tr>			
		<tr>
			<td >아이디</td>
			<td ><input type="text" name="id" size="15" maxlength="10" /></td>
		</tr>
		<tr>
			<td >비밀번호</td>
			<td ><input type="password" name="pwd" size="20" maxlength="20" /></td>
		</tr>
		<tr>
			<td >비밀번호 확인</td>
			<td ><input type="password" name="pwdCheck" size="20" maxlength="20" /></td>
		</tr>
		<tr>
			<td >전화번호</td>
			<td >
				<input type="text" name="tel1" size="6" maxlength="3" />-
				<input type="text" name="tel2" size="6" maxlength="4" />-
				<input type="text" name="tel3" size="6" maxlength="4" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="회원가입" />
				<input type="reset" value="다시쓰기" />
			</td>
		</tr>
	</table>
</form>

<table border=0 cellspacing=0 width=300 >
	<tr>
		<td><s:actionmessage/></td>
	</tr>
</table>

</body>
</html>