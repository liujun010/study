<%--
  Created by IntelliJ IDEA.
  User: liujun
  Date: 2019/3/31
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类</title>
</head>
<body>
<ul id="productCategory" class="easyui-tree"></ul>
<script type="text/javascript">
    $(function () {

        $('#productCategory').tree({
            url: "/product_category/list",

        });
    });

</script>


</body>
</html>
