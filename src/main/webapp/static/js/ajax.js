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

    var args = arguments;

    function getQueryparam(obj) {
        var queryParam = "?";
        for (var index in obj) {
            var key = index;
            var value = obj[index];
            queryParam += key + "=" + value + "&";
        }

        queryParam += "_=" + new Date().getTime();
        return queryParam;

    }

    //获取Get
    function GET(url, queryParam, fn) {

        var xmlhttp = creatXmlHttp();
        xmlhttp.open("get", url + getQueryparam(queryParam), true);

        xmlhttp.onreadystatechange = function () {
            var xmltate = xmlhttp.readyState;
            if (xmltate == 4) {
                var httpstate = xmlhttp.status;
                if (httpstate == 200) {
                    var result = xmlhttp.responseText;
                    if (args.length == 2) {
                        args[1](result);
                    } else if (agrs.length == 3) {
                        args[2](result)
                    }
                } else {
                    alert("服务器请求异常", xmltate)
                }
            }
        }
        xmlhttp.send();
    }

    return {getText: GET}


})();
