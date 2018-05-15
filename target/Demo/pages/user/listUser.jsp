<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: BieFeNg
  Date: 2018/5/11
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    //System.out.println("path:" + path);
    Map<String, Object> map = (Map<String, Object>) request.getAttribute("result");
    //System.out.println(map.size());
%>
<!DOCTYPE html>
<html>
<script src="<%=path%>/script/jquery/jquery-3.3.1.js"></script>
<script src="<%=path%>/script/bootstrap/bootstrap.js"></script>
<script src="<%=path%>/script/bootstrap/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=path%>/style/bootstrap/bootstrap.min.css">
<script>
    var path = '<%=path%>';
    /*
        $(function () {
            $.ajax({
                url:'<%=path%>/test/listAllUer.shtml',
            contentType:"application/json",
            dataType:'json',
            type:'post',
            success:function (data) {
                console.log(data);
            },error:function (r) {
                console.log('error');
            }
        });
    });*/
    debugger;
    var obj = $("<div></div>").each(function () {
        var i = 0;
        i++
    }).get(0);
    console.log(obj);
</script>

<style rel="stylesheet" type="text/css">
    div {
        text-align: center;
    }
</style>
<head>
    <title>用户列表</title>
</head>
<body>
${result.size()}
<div style="margin:auto;margin-top:100px;width: 500px;">
    <div style="color: #5bc0de;text-align: left"><span>用户列表</span></div>
    <div id="tabDiv" style="margin-top: 10px;">
        <table id="userList" class="table table-bordered">
            <thead style="text-align: center">
            <td>id</td>
            <td>name</td>
            <td>role</td>
            <td>permission</td>
            <td>operation</td>
            </thead>
            <c:forEach items="${result.get(\"users\")}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.nickName}</td>
                    <td>${user.id}</td>
                    <td>${user.id}</td>
                    <td><a href="<%=path%>/test/edit.shtml?id=${user.id}">编辑</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
