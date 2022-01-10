<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<s:if test="#session.user == null" >
<script>
location.href = "loginForm.action";
</script>
</s:if>
</head>
<body>
로그인 성공후 보이는 페이지 입니다.
<s:property value="%{session.user.name}"/>님 환영합니다.
<br>
<input type="button" value="로그아웃"  onClick="javascript:location.href='logout.action'" />
</body>
</html>