<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<button id="username">GET提交按钮</button>
<button id="getpost">POST提交按钮</button>
<script src="static/js/ajax.js"></script>

<script>

    (function () {


        document.querySelector("#username").onclick = function () {

            ajax.getText("/testajax",function(result){
                alert("hello"+result)
            })
        }


        document.querySelector("#getpost").onclick = function () {

            ajax.getPost("/testajax",{username:"赵朝旭",age:"26"},function(result){
                alert("post"+result);
            })
        }


        //name=zcx&address=china

        /* if(queryParam.lastIndexOf("&")==queryParam.length-1){
         queryParam=queryParam.substring(0,queryParam.length-1);
         }
         console.log(queryParam)
         document.querySelector("#username").onclick = function () {

         }*/




        /*  function creatXmlHttp(){
         var xmlHttp = null;

         if(window.ActiveXObject){
         xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
         }else{
         xmlHttp = new XMLHttpRequest();
         }
         alert(xmlHttp)
         return xmlHttp;
         }

         document.querySelector("#username").onblur = function () {

         var username =  this.value;

         var xmlHttp = creatXmlHttp();

         xmlHttp.open("get","/checkusername?username="+encodeURIComponent(username)+"&_=new Date().getTime()");//欺骗 浏览器提交数据

         xmlHttp.onreadystatechange = function () {

         var readystate = xmlHttp.readyState;

         if(readystate == 4){

         var httpstate = xmlHttp.status;

         if(httpstate == 200){

         var result = xmlHttp.responseText;
         if(result == "yes"){
         document.querySelector("#help_text").innerText = "OK";
         }else{
         document.querySelector("#help_text").innerText = "false";
         }
         }else{
         alert("服务器请求异常"+xmlHttp)
         }
         }

         }
         xmlHttp.send();
         }*/
    })();

</script>

</body>
</html>