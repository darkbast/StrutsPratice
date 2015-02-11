<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html:html lang="ja" >
<script>
<!--
function check(){
	var form = document.forms[0];
	form.action += "?cmd=check1"
	alert(form.action);
	form.submit();
}
-->
</script>

 <BODY>
  <!-- 1)HTMLのFORMタグに変換される -->
  <html:form action="/board" method="post" >
        
    <html:text property="testName" /><BR>
    <html:submit onclick="check();">
      <bean:message key="greeting" />
    </html:submit>
  </html:form>
     <html:link href="board.do?cmd=check1">Create User</html:link>
 </BODY>
</html:html>