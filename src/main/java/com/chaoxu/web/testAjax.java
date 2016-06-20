package com.chaoxu.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dell on 2016/6/20.
 */
@WebServlet("/tsetAjax")
public class testAjax extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(testAjax.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决输入get缓存的问题
        resp.setContentType("text/html;charset=utf-8");

        resp.addHeader("pragma", "no-cache");
        resp.addHeader("cache-control", "nocache");
        resp.addHeader("expires", "0");

        String username = req.getParameter("username");
        logger.debug("用户名为{}：", username);
        username = new String(username.getBytes("ISO8859-1"),"UTF-8");


        PrintWriter pw = resp.getWriter();

        if ("赵朝旭".equals(username)) {
            pw.print("no");
        } else {
            pw.print("yes");
        }

        pw.flush();
        pw.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String age = req.getParameter("age");

        logger.debug("{}-{}",username,age);

        PrintWriter pw = resp.getWriter();

        pw.print("PHP");
        pw.flush();
        pw.close();
    }
}
