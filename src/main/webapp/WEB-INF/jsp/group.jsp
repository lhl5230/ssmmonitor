<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/12
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<script src="../../jquery/jquery-3.3.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Test</title>
    <link rel="stylesheet" href="./../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootstrap/table/bootstrap-table.css">

</head>
<body>
<div class="panel-group" id="accordion">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                    子组
                </a>
            </h4>
        </div>
        <div id="collapseOne" class="panel-collapse collapse in">
            <div class="panel-body">
                <table class="table table-striped" border="1" cellspacing="0" cellpadding="10">
                    <tr class="success">
                        <th>RecID</th>
                        <th>lastModDateTime</th>
                        <th>createdDateTime</th>
                        <th>lastModBy</th>
                        <th>createdBy</th>
                        <th>groupName</th>
                    </tr>

                    <c:forEach items="${requestScope.groups}" var="group">
                        <tr class="danger">
                            <td>${group.recId}</td>
                            <td>${group.lastModDateTime}</td>
                            <td>${group.createdDateTime}</td>
                            <td>${group.lastModBy}</td>
                            <td>${group.createdBy}</td>
                            <td>${group.groupName}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
    <div class="panel panel-success">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
                    设备
                </a>
            </h4>
        </div>
        <div id="collapseTwo" class="panel-collapse collapse">
            <div class="panel-body">
                <table class="table table-striped" border="1" cellspacing="0" cellpadding="10">
                    <tr class="success">
                        <th>RecID</th>
                        <th>lastModDateTime</th>
                        <th>createdDateTime</th>
                        <th>lastModBy</th>
                        <th>createdBy</th>
                        <th>groupName</th>
                    </tr>

                    <c:forEach items="${requestScope.groups}" var="group">
                        <tr class="danger">
                            <td>${group.recId}</td>
                            <td>${group.lastModDateTime}</td>
                            <td>${group.createdDateTime}</td>
                            <td>${group.lastModBy}</td>
                            <td>${group.createdBy}</td>
                            <td>${group.groupName}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(function () {
        $('#collapseTwo').collapse('show')
    });
    $(function () {
        $('#collapseOne').collapse('hide')
    });
</script>

</body>
</html>
