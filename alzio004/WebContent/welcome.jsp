<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>로그인 되었습니다.<hr>
사용된 로그인아이디:<s:property value="id" /><br>
사용된 로그인비밀번호:<s:property value="pwd" />
</body>
</html>