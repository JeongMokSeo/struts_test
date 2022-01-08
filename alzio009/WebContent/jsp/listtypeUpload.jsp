<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트/Array 타입사용 파일 업로드 입력 폼</title>
</head>
<body>
<h2>다중파일 업로드</h2>
<s:form action="ArraytypeAction" method="post" enctype="multipart/form-data">
	<s:file name="uploads" label="File-1" size="60" />
	<s:file name="uploads" label="File-2" size="60" />
	<s:file name="uploads" label="File-3" size="60" />
	<s:file name="uploads" label="File-4" size="60" />
	<s:submit value="업로드"/>
</s:form>
</body>
</html>