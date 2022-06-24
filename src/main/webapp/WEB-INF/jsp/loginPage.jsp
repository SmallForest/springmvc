<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: smallforest
  Date: 2022/6/22
  Time: 4:27 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="co-md-12 column">
            <div class="page-header">
                <h1>登录页</h1>
            </div>
        </div>
    </div>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <div class="form-group">
            <label for="bName">用户名</label>
            <input name="username" type="text" class="form-control" id="bName" required>
        </div>
        <div class="form-group">
            <label for="bCount">密码</label>
            <input name="password" type="text" class="form-control" id="bCount" required>
        </div>
        <button type="submit" class="btn btn-default">登录</button>
    </form>
</div>
</body>
</html>
