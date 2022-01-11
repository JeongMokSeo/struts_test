<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<s:if test="#session.user == null" >
<script>
	parent.location.href="login.action";
</script>
</s:if>
</head>
<body>
	<table style="font-family: 맑은 고딕; width:100%; table-layout:fixed; height:100%;" align="center" border="0" bgcolor="#f6cef5" cellspacing="0">
		<tr bgcolor="#ffffff">
			<td rowspan="2" align="center" width="94" nowrap><img align="middle" src="/web/image/logo.jpg"></td>
			<td colspan="3" align="center" nowrap>
				<font size="8" color="#0000cd">Web</font>
			</td>
		</tr>
		<tr bgcolor="#ffffff">
			<td align="center" colspan="2"> <input type="image" src="/web/image/qna.png" alt="QNA게시판" onclick="javascript:parent.contents.location.href='qnaList.action'"></td>
			<td align="right"> 
				<s:property value="%{#session.user.name}" />님 환영합니다.
				<input type="button" value="로그아웃" onclick="javascript:parent.location.href='logout.action'">
			</td>
		</tr>
	</table>
	
	
</body>
</html>