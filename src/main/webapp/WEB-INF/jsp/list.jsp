<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/14
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GB2312">
    <title>学员信息列表</title>
</head>
<body style="align-content: center">
<h1 style="text-align: center">学员信息列表<a href="/student/add">添加</a></h1>
<table width="100%" border=1px  cellpadding="1" cellspacing="1">
    <tr>
        <th>&nbsp;id</th>
        <th>姓名</th>
        <th>密码</th>
        <th>QQ</th>
        <th>修真类型</th>
        <th>入学时间</th>
        <th>毕业院校</th>
        <th>线上学号</th>
        <th>日报链接</th>
        <th>立愿</th>
        <th>引荐师兄</th>
        <th>审核师兄</th>
        <th>创建时间</th>
        <th>修改时间</th>
        <th>电话</th>
        <th>公司</th>
        <th>职位</th>
        <th>介绍</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${studentList}" var="stu">
    <tr align="center" >
        <td>${stu.id}</td>
        <td>${stu.stu_name}</td>
        <td>${stu.stu_pwd}</td>
        <td>${stu.stu_QQ}</td>
        <td>${stu.course}</td>
        <td>${stu.stu_date}</td>
        <td>${stu.school}</td>
        <td>${stu.stu_ID}</td>
        <td>${stu.daily_link}</td>
        <td>${stu.hope}</td>
        <td>${stu.yinjian}</td>
        <td>${stu.shenhe}</td>
        <jsp:useBean id="createTime" class="java.util.Date" scope="page"/>
        <jsp:setProperty property="time" name="createTime" value="${stu.create_at}"/>
        <td><fmt:formatDate value="${createTime}" pattern="yyyy-MM-dd" /></td>
        <jsp:useBean id="updateTime" class="java.util.Date" scope="page"/>
        <jsp:setProperty property="time" name="updateTime" value="${stu.update_at}"/>
        <td><fmt:formatDate value="${updateTime}" pattern="yyyy-MM-dd" /></td>
        <td>${stu.phone}</td>
        <td>${stu.company}</td>
        <td>${stu.position}</td>
        <td>${stu.introduce}</td>
        <td>
            <a href="/Task4/student/delete/${stu.id}">删除</a>
            <a href="/Task4/student/update/${stu.id}">修改</a>
        </td>
    </tr>
    </c:forEach>

</table>
</body>
</html>