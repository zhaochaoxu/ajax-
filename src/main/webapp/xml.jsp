<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2016/6/21
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读取Xml</title>
    <h1>读取Ajax.XML文件</h1>
</head>
<body>
    <button id="btn">读取按钮</button>

    <div id = "divd"></div>

    <%--<div id = "div">
        <h3>Tom <small>101</small></h3>
        <div> china</div>
    </div>

    <div id = "di">
        <h3>Kom <samll>101</samll></h3>
        <div> china</div>
    </div>

    <div id = "i">
        <h3>Jom <samll>101</samll></h3>
        <div> china</div>
    </div>--%>


</body>

<script>

    (function(){

        function CreatxmlHttp(){
            var xml = null;
            if(window.ActiveXObject){
                xml = new ActiveXObject("Microsoft.XMLHTTP")
            }else{
                xml = new XMLHttpRequest();
            }
            return xml;
        }


        <%--<div id = "i">
            <h3>Jom <samll>101</samll></h3>
            <div> china</div>
        </div>--%>

        function getuser(id,name,address){

            var h3 = document.createElement("h3");
            var small = document.createElement("small");
            var div = document.createElement("div");
            var p = document.createElement("p")

            var smallid = document.createTextNode(id);
            var h3name = document.createTextNode(name);
            var address = document.createTextNode(address);

            small.appendChild(smallid);
            h3.appendChild(h3name);
            h3.appendChild(small);

            p.appendChild(address);
            div.appendChild(h3);
            div.appendChild(p);
            document.getElementById("divd").appendChild(div);

        }

        document.getElementById("btn").onclick = function(){

            xmlHttp = CreatxmlHttp();

            xmlHttp.open("get","/ajax.xml",true);

            xmlHttp.onreadystatechange = function(){

                if(xmlHttp.readyState == 4){

                   if(xmlHttp.status == 200){
                       //清空读取数据
                       document.querySelector("#divd").innerText="";
                       var userxml = xmlHttp.responseXML;
                       var userArray = userxml.getElementsByTagName("user");
                       for(var i = 0; i <userArray.length ; i++){
                           var user = userArray[i];
                           var id = user.getAttribute("id");
                           var name = user.getElementsByTagName("username")[0].childNodes[0].nodeValue;
                           var address = user.getElementsByTagName("address")[0].childNodes[0].nodeValue;

                           console.log(id+":"+name+":"+address);

                           getuser(id,name,address);
                       }


                   }else{
                       alert("服务器请求异常")
                   }
                }
            }

            xmlHttp.send();

        };


    })();
</script>

</html>
