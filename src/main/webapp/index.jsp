<%--
  Created by IntelliJ IDEA.
  User: BieFeNg
  Date: 2018/5/7
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String path = request.getContextPath();
%>

<script src="script/jquery/jquery-3.3.1.js"></script>

<script>
    $(function () {
        $.ajax({
            url: "<%=path%>/test/testJson.shtml",
            type: "post",
            contentType: 'application/json;charset=utf-8',
            success: function (data) {
                $("body").html("<p>" + data + "</p>");
            }, error: function (data) {
                alert("error");
            }
        });
    })
</script>
<head>
    <title>首页</title>
</head>
<body>
Wolcome!
</body>
</html>
