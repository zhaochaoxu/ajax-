<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/6/20
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>post</title>
</head>
<body>
<button id="btn">post提交</button>
<form action="" enctype="application/x-www-form-urlencoded"></form>
<script>

    function creatxmlhttp() {

        var xmlhttp = null;

        if (window.ActiveXObject) {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        } else {
            xmlhttp = new XMLHttpRequest();
        }

        return xmlhttp;
    }


    document.querySelector("#btn").onclick = function(){
        var xml = creatxmlhttp();

        xml.open("post","/ajax",true);
        xml.setRequestHeader("Content-Type","application/x-www-form-urlencoded")

        xml.send("name=牛丽娟&age=26");
    };


</script>

</body>
</html>
