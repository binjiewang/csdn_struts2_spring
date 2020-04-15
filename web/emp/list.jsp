<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: binjiewang
  Date: 2020-04-15
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
</head>
<body>
    员工信息<br/>
    <s:iterator value="empList" var="emp" status="st">
        <s:property value="#st.getIndex()+1"></s:property> <s:property value="#emp.empno"></s:property> <s:property value="#emp.ename"></s:property><br/>
    </s:iterator>
    <s:debug></s:debug>
</body>
</html>
