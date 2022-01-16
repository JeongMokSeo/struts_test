<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="2">
	<tr>
		<td align="center"><h2>QnA게시판</h2></td>
	</tr>
	<tr>
		<td height="20"></td>
	</tr>
</table>
<table width="100%" border="0" cellspacing="0" cellpadding="2">
	<tr align="center" bgcolor="#f3f3f3">
		<th width="10%" align="center">번호</th>
		<th width="50%" align="center">제목</th>
		<th width="15%" align="center">글쓴이</th>
		<th width="15%" align="center">날짜</th>
		<th width="10%" align="center">조회</th>
	</tr>
	<tr bgcolor="#f777777">
		<td height="1" colspan="5"></td>
	</tr>
	<s:iterator value="list" status="stat">
		<s:url id="viewURL" action="qnaView">
			<s:param name="qnaNo">
				<s:property value="qnaNo"/>
			</s:param>
			<s:param name="currentPage">
				<s:property value="currentPage"/>
			</s:param>			
		</s:url>
		
	<tr align="center" bgcolor="#f3f3f3">
		<td><s:property value="qnaNo" /></td>
		<td  align="left"><s:a href="%{viewURL}"><s:property value="qnaSubject" /></s:a></td>
		<td  align="center"><s:property value="name" /></td>
		<td  align="center"><s:property value="qnaRegdate" /></td>
		<td  align="right"><s:property value="qnaReadhit" /></td>
	</tr>		
	<tr bgcolor="#777777">	
	</tr>	
	</s:iterator>
	<s:if test="list.size() <=0" >
		<tr align="center" bgcolor="#ffffff">
			<td colspan="5">등록된 게시물이 없습니다.</td>	
		</tr>	
		<tr align="center" bgcolor="#777777">
			<td height="1" colspan="5"></td>	
		</tr>	
	</s:if>
	
	<tr align="center">
		<td colspan="5"> <s:property value="pagingHtml" escape="false"/></td>
	</tr>
	<tr align="right">
		<td colspan="5"><input type="button" value="글쓰기" onclick="javascript:location.href='qnaWriteForm.action?currentPage=<s:property value="currentPage" />'"></td>
	</tr>
	
</table>
</body>
</html>