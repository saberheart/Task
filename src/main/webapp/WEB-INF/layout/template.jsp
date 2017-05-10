<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/29
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="titls" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="titles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
    <titls:insertAttribute name="title"/>
</head>
<body>
<titles:insertAttribute name="header"/>
<titles:insertAttribute name="boby"/>
<titles:insertAttribute name="footer"/>
</body>
</html>
