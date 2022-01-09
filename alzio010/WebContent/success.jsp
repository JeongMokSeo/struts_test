<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력폼</title>
</head>
<body>
데이터베이스의 내요을 성공적으로 출력<br>
test 데이터베이스의  dept 테이블의 저장된 내용입니다.
<br>
<s:iterator value="list" status="stat">
부코드: <s:property value="deptno"/><br>
부서명: <s:property value="list[#stat.index].dname"/><br>
부서위치: <s:property value="list[#stat.index].dloc"/><br>
</s:iterator>

<a href="main.jsp">다시하기</a>
</body>
</html>