<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>단일 파일 업로드 성공</title>
</head>
<body>
<h2>파일 업로드된 내용</h2>

<p>
<ul>
	<li> ContentType: <s:property value="uploadContentType" /></li>
	<li> FileName: <s:property value="uploadFileName" /></li>
	<li> File: <s:property value="upload" /></li>
</ul>

</body>
</html>