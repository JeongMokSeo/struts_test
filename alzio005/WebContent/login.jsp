<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td {font-size: 10pt; color: #777777;}
	a {font-size: 10pt; color: #777777; text-decoration: none;}
	a:vlink {text-decoration: none;}
</style>
</head>
<body>
<table width="800" border="1" bordercolor="#f3f3f3" cellspacing="0" >
	<tr>
		<td width="200" bgcolor="#c0c000" >
			<form name="loginFrm" method="post" action="loginAction.action" >
				<table border="0" bordercolor="#ff0000" cellspacing="0" >
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" size="11" maxlength="10"></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type="password" name="pwd" size="11" maxlength="10"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit" value="로그인"></td>
					</tr>
					<tr>
						<td colspan="2" >
							<s:actionmessage/>
						</td>
					</tr>
				</table>
			</form>
		</td>
		<td bgcolor="#c0c0c0">
			지금은 struts2 result를 공부하고 있습니다.
		</td>
	<tr height="100">
		<td colspan="2" >
			오늘까지 배운 내용을 모두 복습합니다.
		</td>
	</tr>
		
	</tr>
</table>
</body>
</html>