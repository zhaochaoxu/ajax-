package com.chaoxu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dell on 2016/6/21.
 */
@WebServlet("/ajax.xml")
public class XmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/xml");
        PrintWriter pw = resp.getWriter();
        pw.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        pw.print("<users>");

        pw.print("<user id=\"100\">");
        pw.print("<username>jack</username>");
        pw.print("<address>china</address>");
        pw.print("</user>");

        pw.print("<user id=\"101\">");
        pw.print("<username>zcx</username>");
        pw.print("<address>china</address>");
        pw.print("</user>");
        pw.print("<user id=\"102\">");
        pw.print("<username>nlj</username>");
        pw.print("<address>liaoc</address>");
        pw.print("</user>");
        pw.print("<user id=\"103\">");
        pw.print("<username>cltk</username>");
        pw.print("<address>henan</address>");
        pw.print("</user>");
        pw.print("<user id=\"104\">");
        pw.print("<username>wanglu</username>");
        pw.print("<address>suzhou</address>");
        pw.print("</user>");
        pw.print("<user id=\"105\">");
        pw.print("<username>zyj</username>");
        pw.print("<address>zhaotou</address>");
        pw.print("</user>");
        pw.print("</users>");

        pw.flush();
        pw.close();

    }
}
