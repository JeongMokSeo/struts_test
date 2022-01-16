<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QnA 게시판</title>
</head>
<body>
<table width="100%" board="0" cellspacint="0" cellpadding="2">
	<tr>
		<td align="center"><h2>QnA 게시판</h2></td>
	</tr>
</table>
<form action="qnaReplyWrite.action" method="post">
<s:hidden name="qnaNo" value="%{resultClass.qnaNo}" />
<s:hidden name="currentPage" value="%{currentPage}" />
<table  width="100%" board="0" cellspacint="0" cellpadding="2">
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<tr>
		<td width= "20%" bacolor="#f4f4f4"> 제목 </td>
		<td width= "80%" bacolor="#ffffff"><s:property value="%{resultClass.qnaSubject }" /> </td>
	</tr>
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<tr>
		<td bacolor="#f4f4f4"> 작성자 </td>
		<td bacolor="#ffffff"><s:property value="%{#session.user.name }" /> </td>
	</tr>
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<tr>
		<td bacolor="#f4f4f4"> 내용 </td>
		<td bacolor="#ffffff" height="100"><s:property value="%{resultClass.qnaContent}" /> </td>
	</tr>
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<tr>
		<td bacolor="#f4f4f4"> 첨부파일 </td>
		<td bacolor="#ffffff">
			<s:if test="resultClass.qnaOrgFile != null">
				<s:url id="download" action="qnaFileDownload">
					<s:param name="qnaNo" >
						<s:property value="qnaNo" />
					</s:param>
				</s:url>
				<s:a href="%{download}" >
					<s:property value="resultClass.qnaOrgFile" />
				</s:a>
			</s:if>
		</td>
	</tr>
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<tr >
		<td height="20" colspan="2"></td>
	</tr>
	<tr>
		<td height="10" colspan="2">댓글</td>
	</tr>
	<tr bgcolor="#777777">
		<td height="1" colspan="2"></td>
	</tr>
	<s:iterator value="replyList" status="stat">
		<tr>
			<td bacolor="#f4f4f4"><s:property value="name" /></td>
			<td bacolor="#ffffff"><s:property value="comContents" /> </td>
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td>
		</tr>	
	</s:iterator>
	<tr bgcolor="#777777">
		<td height="10" colspan="2"></td>
	</tr>	
	<tr>
		<td bacolor="#f4f4f4"> 댓글쓰기 </td>
		<td>
			<s:textfield theme="simple" name="comContents" cssStyle="width:85%" maxlength="100" />
			<input type="submit" value="댓글쓰기">
		</td>
	</tr>
	<tr bgcolor="#777777">
		<td height="20" colspan="2"></td>
	</tr>	
	<tr >
		<td align="right" colspan="2">
			<s:if test="#session.user.id == resultClass.id">
				<input type="button" name="modify" value="수정" onclick="javascript:location.href='qnaModifyForm.action?qnaNo=<s:property value="qnaNo" />&currentPage=<s:property value="currentPage" />'" >
			</s:if>
			<input name="list" type="button" value="목록" onclick="javascript:location.href='qnaList.action?currentPage=<s:property value="currentPage" />'" >
		</td>
	</tr>	
</table>	

</form>

</body>
</html>