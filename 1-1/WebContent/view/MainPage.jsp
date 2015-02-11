<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html lang="ja" >
<head>
<title>메인페이지</title>
<script>
	function onMovingTest(){
		document.MainForm.action += "?action=movingFormTest";
		alert(MainForm.action.value);
		document.MainForm.submit();
	}

</script>
</head>
 <BODY>
  <html:form action="/MainAction" method="post">
  	<input type="button" onclick="onMovingTest();"/>
  </html:form>
 </BODY>
</html:html>