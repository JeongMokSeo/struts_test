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

*문자열을 비교합니다.
<br>
사용자가 구매한 상품은 <s:if test="%{pname =='test' }" >TEST입니다.  </s:if>
<s:elseif test="%{pname =='apple' }" >apple입니다. </s:elseif>
<s:else>그외의 것입니다. </s:else>

<br>
*boolean을 비교합니다.
<br>
<s:if test="%{pname.startsWith('t') == true }">첫자가 t입니다 </s:if>
<s:else>첫글자는 t 가 아닙니다.</s:else>
<br>
*수치를 비교합니다.
<br>
<s:if test="%{pno > 1 }" > pno는 1보다 큽니다. </s:if>
<s:else>pno는 1과 같거나 작습니다. </s:else>
<br>

*일반 HTML태그에서 액션에 접근합니다.
<br>
<input type="text" name="name" value = "${pname }" />
<br>
*request파라미터를 받아 봅니다.
<s:property value= "%{#parameters.pname}" />
<br>

*임의로 프로퍼티에 값을 넣습니다.
<br>
<s:set name="pSet" value="pname" />
사용자는 <s:property value="pSet" />을 구매하셨습니다.
<hr>

<table>
<s:iterator value="aList" status="stat">
	<tr>
		<td><s:property value="pno" /></td>
		<td><s:property value="pname" /></td>
		<td><s:property value="pprice" /></td>
		<td><s:property value="pcnt" /></td>
	</tr>
</s:iterator>
</table>


<br>
<a href="input.jsp">다시 제품 구매하기</a>
</body>
</html>