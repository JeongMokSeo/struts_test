<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다운로드 리스트 폼</title>
</head>
<body>
<h4>다운로드 리스트</h4>

다운로드 디렉토리: <s:property value="BasePath" />
<ul>
	<s:iterator value="listFile" status ="stat">
		<s:url id="download" action="FileDownload">
			<s:param name="basePath" value="basePath" />
			<s:param name="fileName" >
				<s:property value="listFile[#stat.index].name"/>
			</s:param>
		</s:url>
		<li>
		<s:a href="%{download}" >
			<s:property value="listFile[#stat.index].name"/>
		</s:a>
		</li>
		<br>
	</s:iterator>
	<!-- FileDownload.action?basePath=D:/test/downlaod&fileName=XXXX -->
	
</ul>

<br>
*파일 이름을 클릭하면 파일이 다운로드 됩니다.

</body>
</html>