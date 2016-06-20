<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/6/20
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>post</title>
</head>
<body>

<button id="btn"></button>
<form action=""  enctype="application/x-www-form-urlencoded"></form>
<script>
    (function(){

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
            xml.send("name=赵朝旭");
        };

    })();
</script>

</body>
</html>
