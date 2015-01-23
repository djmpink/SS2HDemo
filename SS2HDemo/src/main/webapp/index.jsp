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
    <title>Log in</title>
  </head>
  <body>
  <s:form action="login">
    <s:textfield name="username" key="user"/>
    <s:textfield name="password" key="pass"/>
    <s:submit key="login"/>
  </s:form>
  </body>
</html>
