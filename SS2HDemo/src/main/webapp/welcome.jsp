<%--
  Created by IntelliJ IDEA.
  User: zl
  Date: 1/20/2015
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title><s:text name="succPage"/></title>
  </head>
  <body>
    <s:text name="succTip">
      <s:param>${sessionScope.user}</s:param>
    </s:text><br>
  </body>
</html>
