<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: CHENCHEN
  Date: 2018/10/26
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <s:form action="login">
        <s:textfield name="account.user" label="用户"/>
        <s:password name="account.paw" label="密码"/>
        <s:submit value="提交"/>
    </s:form>
    <s:property value="msg"/>
</body>
</html>
