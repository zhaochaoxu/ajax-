var ajax = (function () {

    function creatXmlHttp() {
        var xmlhttp = null;
        if (window.ActiveXObject) {
            xmlhttp = new ActiveXObject("microsoft.XMLHTTP");
        } else {
            xmlhttp = new XMLHttpRequest();
        }
        return xmlhttp;
    }

    function getQueryparam(ispost,obj) {
        var queryParam = "";
        if(!ispost){
            queryParam = "?";
        }
        for (var index in obj) {
            var key = index;
            var value = obj[index];
            queryParam += key + "=" + value + "&";
        }

        if(!ispost){
            queryParam += "_=" + new Date().getTime();

        }else{
            if(queryParam.lastIndexOf("&")==queryParam.length-1){
                queryParam=queryParam.substring(0,queryParam.length-1);
            }
        }

        return queryParam;
    }

    //获取Get
    function GET(url, queryParam, fn) {
        var args = arguments;
        var xmlhttp = creatXmlHttp();
        xmlhttp.open("get", url + getQueryparam(false,queryParam), true);

        xmlhttp.onreadystatechange = function () {
            var xmltate = xmlhttp.readyState;
            if (xmltate == 4) {
                var httpstate = xmlhttp.status;
                if (httpstate == 200) {
                    var result = xmlhttp.responseText;
                    if (args.length == 2) {
                        args[1](result);
                    }else if(args.length == 3){
                        args[2](result);
                    }
                } else {
                    alert("服务器请求异常", xmltate)
                }
            }
        }
        xmlhttp.send();
    }

    //获取Post
    function Post(url, queryParam, fn) {
        var args = arguments;
        var xmlhttp = creatXmlHttp();
        xmlhttp.open("post", url, true);
        xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded")
        xmlhttp.onreadystatechange = function () {
            var xmltate = xmlhttp.readyState;
            if (xmltate == 4) {
                var httpstate = xmlhttp.status;
                if (httpstate == 200) {
                    var result = xmlhttp.responseText;
                    if (args.length == 2) {
                        args[1](result);
                    } else if (args.length == 3) {
                        args[2](result)
                    }
                } else {
                    alert("服务器请求异常", xmltate)
                }
            }
        }
        xmlhttp.send(getQueryparam(true,queryParam));
    }

    return {getText: GET,
            getPost:Post
    }


})();
