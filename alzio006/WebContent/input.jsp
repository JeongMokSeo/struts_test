<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>제품구매</h2>
<s:property value="pname" />
<s:property value="message" />
<s:form name="dataFrm" action="insertAction.action" method="post">
	<s:textfield label="제품번호"  name="pno" value="%{pno}"/>
	<s:textfield label="제품이름"  name="pname" value="%{pname}"/>
	<s:textfield label="제품가격"  name="pprice" value="%{pprice}"/>
	<s:textfield label="구매수량"  name="pcnt" value="%{pcnt}"/>
	
	<s:submit type="button" label="구매" />
</s:form>


</body>
</html>