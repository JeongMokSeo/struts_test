<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Array List Type 다중 파일 업로드 페이지</title>
</head>
<body>
<h2>다중 파일 업로드된 내용</h2>
<br>
<s:iterator value="uploads" status="stat">
[File - <s:property value="%{stat.index +1"/>] <br>
컨텐츠타입 :  <s:property value="%{uploadsContentType[#stat.index]}" /><br>
파일 이름 :  <s:property value="%{uploadsFileName[#stat.index]}" /><br>
임시 파일이름 :  <s:property value="%{uploads[#stat.index]}" /><br>
<hr>
<hr>
</s:iterator>
</body>
</html>