<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function validation() {
	var frm = document.frmMain;
	
	if (frm.qnaSubject.value == "") {
		alert("제목을 입력해 주세요");
		return false;
	} else if (frm.qnaContent.value == "") {
		alert("내용을 입력해 주세요");
		return false;
	}
	return true;	
}
</script>
</head>
<body>
<table width="100%" board="0" cellspacint="0" cellpadding="2">
	<tr>
		<td align="center"><h2>QnA 게시판</h2></td>
	</tr>
</table>
<form name="frmMain" action="qnaModify.action" method="post" enctype="multipart/form-data" onsubmit="return validation()">

	<s:hidden name="qnaNo" value="%{resultClass.qnaNo}" />
	<s:hidden name="currentPage" value="%{currentPage}" />
	
	<table width="100%" board="0" cellspacint="0" cellpadding="0">
		<tr>
			<td align="right" colspan="2"><font color="#ff0000">*</font>는 필수 입력사항 입니다.</td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr>
			<td bgcolor="#f4f4f4"><font color="#ff0000">*</font>제목</td> 
			<td bgcolor="#ffffff"><s:textfield theme="simple" name="qnaSubject" value="%{resultClass.qnaSubject}" cssStyle="width:100%" maxlength="50" /></td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr>
			<td bgcolor="#f4f4f4">작성자</td> 
			<td bgcolor="#ffffff"><s:property value="%{#session.user.name}" /></td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr>
			<td bgcolor="#f4f4f4"><font color="#ff0000">*</font>비밀번호</td> 
			<td bgcolor="#ffffff"><s:textfield theme="simple" name="password" value="%{resultClass.password}" cssStyle="width:100%" maxlength="50" /></td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr>
			<td bgcolor="#f4f4f4"><font color="#ff0000">*</font>내용</td> 
			<td bgcolor="#ffffff"><s:textarea theme="simple" name="qnaContent" value="%{resultClass.qnaContent}" cols="50" rows="10" cssStyle="width:100%"  /></td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr>
			<td bgcolor="#f4f4f4">첨부파일</td> 
			<td bgcolor="#ffffff">
				<s:file name="upload" theme="simple" />
				<s:if test="resultClass.qnaOrgFile != null" >
					<br>&nbsp; * <s:property value="resultClass.qnaOrgFile"/>
					파일이 등록되어 있습니다.<br> 다시 업로드하면 기존의 파일은 삭제됩니다.				
				</s:if>
			</td> 
		</tr>
		<tr bgcolor="#777777">
			<td height="1" colspan="2"></td> 
		</tr>
		<tr >
			<td height="10" colspan="2"></td> 
		</tr>
		<tr >
			<td align="right" colspan="2">
				<input name="submit" type="submit" value="작성완료" />&nbsp;
				<input name="list" type="button" value="목록" onclick="javascript:location.href='qnaList.action?currentPage=<s:property value="currentPage" />'" >
			</td> 
		</tr>
		
	</table>
</form>
</body>
</html>