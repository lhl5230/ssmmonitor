<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/3
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head/head.jsp" %>
<script src="bootstrap/treeview/bootstrap-treeview.min.js"></script>
<html>
<head>
</head>
<body>
<div id="tree"></div>

<script type="text/javascript">

    function getTree() {
        // Some logic to retrieve, or generate tree structure
        var tree = [
            {
                text: "Parent 1",
                nodes: [
                    {
                        text: "Child 1",
                        nodes: [
                            {
                                text: "Grandchild 1"
                            },
                            {
                                text: "Grandchild 2"
                            }
                        ]
                    },
                    {
                        text: "Child 2"
                    }
                ]
            },
            {
                text: "Parent 2"
            },
            {
                text: "Parent 3"
            },
            {
                text: "Parent 4"
            },
            {
                text: "Parent 5"
            }
        ];
        return tree;
    }

    $('#tree').treeview({data: getTree()});
</script>
</body>
</html>
