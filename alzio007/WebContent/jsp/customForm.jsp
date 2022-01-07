<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객정보 입력폼 - 유효성 검사</title>
</head>
<body>
<center>
<h2>고객 정보 입력</h2>
<s:form action="CustomAction" theme="xhtml">
	<s:textfield label="이름" name="name" />
	<s:textfield label="비밀번호" name="pwd" />
	<s:textfield label="비밀번호재확인" name="pwdchk" />
	<s:textfield label="홈페이지" name="hpage" />
	<s:textfield label="사진" name="pic" />
	<s:submit />
</s:form>
</center>

유효성 검사 오류 : <br>
<s:fielderror />
<hr>

문자길이 오류 : <br>
<s:fielderror>
	<s:param>name</s:param>
</s:fielderror>
<hr>



</body>
</html>