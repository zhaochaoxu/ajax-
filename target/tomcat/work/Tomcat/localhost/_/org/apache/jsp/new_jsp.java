/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-06-21 05:24:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<button id=\"username\">GET提交按钮</button>\r\n");
      out.write("<button id=\"getpost\">POST提交按钮</button>\r\n");
      out.write("<script src=\"static/js/ajax.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    (function () {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        document.querySelector(\"#username\").onclick = function () {\r\n");
      out.write("\r\n");
      out.write("            ajax.getText(\"/testajax\",function(result){\r\n");
      out.write("                alert(\"hello\"+result)\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        document.querySelector(\"#getpost\").onclick = function () {\r\n");
      out.write("\r\n");
      out.write("            ajax.getPost(\"/testajax\",{username:\"赵朝旭\",age:\"26\"},function(result){\r\n");
      out.write("                alert(\"post\"+result);\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        //name=zcx&address=china\r\n");
      out.write("\r\n");
      out.write("        /* if(queryParam.lastIndexOf(\"&\")==queryParam.length-1){\r\n");
      out.write("         queryParam=queryParam.substring(0,queryParam.length-1);\r\n");
      out.write("         }\r\n");
      out.write("         console.log(queryParam)\r\n");
      out.write("         document.querySelector(\"#username\").onclick = function () {\r\n");
      out.write("\r\n");
      out.write("         }*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /*  function creatXmlHttp(){\r\n");
      out.write("         var xmlHttp = null;\r\n");
      out.write("\r\n");
      out.write("         if(window.ActiveXObject){\r\n");
      out.write("         xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("         }else{\r\n");
      out.write("         xmlHttp = new XMLHttpRequest();\r\n");
      out.write("         }\r\n");
      out.write("         alert(xmlHttp)\r\n");
      out.write("         return xmlHttp;\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         document.querySelector(\"#username\").onblur = function () {\r\n");
      out.write("\r\n");
      out.write("         var username =  this.value;\r\n");
      out.write("\r\n");
      out.write("         var xmlHttp = creatXmlHttp();\r\n");
      out.write("\r\n");
      out.write("         xmlHttp.open(\"get\",\"/checkusername?username=\"+encodeURIComponent(username)+\"&_=new Date().getTime()\");//欺骗 浏览器提交数据\r\n");
      out.write("\r\n");
      out.write("         xmlHttp.onreadystatechange = function () {\r\n");
      out.write("\r\n");
      out.write("         var readystate = xmlHttp.readyState;\r\n");
      out.write("\r\n");
      out.write("         if(readystate == 4){\r\n");
      out.write("\r\n");
      out.write("         var httpstate = xmlHttp.status;\r\n");
      out.write("\r\n");
      out.write("         if(httpstate == 200){\r\n");
      out.write("\r\n");
      out.write("         var result = xmlHttp.responseText;\r\n");
      out.write("         if(result == \"yes\"){\r\n");
      out.write("         document.querySelector(\"#help_text\").innerText = \"OK\";\r\n");
      out.write("         }else{\r\n");
      out.write("         document.querySelector(\"#help_text\").innerText = \"false\";\r\n");
      out.write("         }\r\n");
      out.write("         }else{\r\n");
      out.write("         alert(\"服务器请求异常\"+xmlHttp)\r\n");
      out.write("         }\r\n");
      out.write("         }\r\n");
      out.write("\r\n");
      out.write("         }\r\n");
      out.write("         xmlHttp.send();\r\n");
      out.write("         }*/\r\n");
      out.write("    })();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
