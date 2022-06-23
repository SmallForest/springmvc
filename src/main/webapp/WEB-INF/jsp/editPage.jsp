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
    <title>编辑书籍</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="co-md-12 column">
                <div class="page-header">
                    <h1>编辑书籍</h1>
                </div>
            </div>
        </div>
        <form method="post" action="${pageContext.request.contextPath}/book/saveBook">
            <input type="hidden" name="bookID" value="${EBook.bookID}">
            <div class="form-group">
                <label for="bName">书籍名称</label>
                <input name="bookName" type="text" class="form-control" id="bName" value="${EBook.bookName}" required>
            </div>
            <div class="form-group">
                <label for="bCount">书籍数量</label>
                <input name="bookCounts" type="text" class="form-control" id="bCount" value="${EBook.bookCounts}" required>
            </div>
            <div class="form-group">
                <label for="bDetail">书籍详情</label>
                <input name="detail" type="text" class="form-control" id="bDetail" value="${EBook.detail}"required>
            </div>
            <button type="submit" class="btn btn-default">更新</button>
        </form>
    </div>
</body>
</html>
