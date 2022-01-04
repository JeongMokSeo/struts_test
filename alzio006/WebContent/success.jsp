<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품구매 입력 리스트</title>
</head>
<body>
<h2>제품 구매 수량</h2>
<br><br><br>

사용자가 구매한 제품번호 : <s:property value="pno" /><br>
사용자가 구매한 제품이름 : <s:property value="pname" /><br>
사용자가 구매한 제품가격 : <s:property value="pprice" /><br>
사용자가 구매한 제품수량 : <s:property value="pcnt" /><br>
<hr>
사용자가 구매한 제품번호 : <s:property value="vo.pno" /><br>
사용자가 구매한 제품이름 : <s:property value="vo.pname" /><br>
사용자가 구매한 제품가격 : <s:property value="vo.pprice" /><br>
사용자가 구매한 제품수량 : <s:property value="vo.pcnt" /><br>

<a href="input.jsp">다시 제품 구매하기</a>
</body>
</html>