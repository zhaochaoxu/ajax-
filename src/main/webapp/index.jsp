<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/6/20
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
</head>
<body>

<input type="text" id="input"><span id="spans"></span>

<script>

    (function () {

        function creatxmlhttp() {

            var xmlhttp = null;

            if (window.ActiveXObject) {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            } else {
                xmlhttp = new XMLHttpRequest();
            }

            return xmlhttp;
        }

        document.querySelector("#input").onchange = function () {

            var username = this.value;
            //1.创建Ajax引擎
            var xmlhttp = creatxmlhttp();

            //2.设置请求请求的方式url
            xmlhttp.open("get", "/tsetAjax?username=" + username);

            //3.设置回调函数
            xmlhttp.onreadystatechange = function () {

                //3.1获取回电状态码{1,2,3,4}
                var readystate = xmlhttp.readyState;

                if (readystate == 4) {

                    //3.2获取HTTP状态码
                    var httpstatue = xmlhttp.status;

                    //判断HTTP状态码是否是200（成功状态）
                    if (httpstatue == 200) {

                        //获取处理服务器的数据响应
                        var result = xmlhttp.responseText;

                        //判断相应数据
                        if (result == "yes") {
                            document.querySelector("#spans").innerText = "√";
                        } else {
                            document.querySelector("#spans").innerText = "此用户名已被占用！"
                        }
                    }else {
                        alert("服务器请求异常：" + readystatu)
                    }

                }
            }

            //4 发送请求
            xmlhttp.send();

        }

    })();


</script>

</body>
</html>
