<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUtils 사용 파일 업로드 입력 폼</title>
</head>
<body>
<h2>파일 업로드</h2>
<s:form action="fileUploadActionStream" method="post" enctype="multipart/form-data">
	<s:file name="upload" label="File" size="60" />
	<s:submit/>
</s:form>
</body>
</html>