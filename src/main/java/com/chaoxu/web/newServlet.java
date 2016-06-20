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
@WebServlet("/tajax")
public class newServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(newServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决get 缓存问题

        resp.setContentType("text/html;charset=utf-8");

        resp.addHeader("pragma", "no-cache");
        resp.addHeader("cache-control", "nocache");
        resp.addHeader("expires", "0s");

        String username = req.getParameter("username");
        username = new String(username.getBytes("ISO8859-1"), "UTF-8");
        logger.debug("{}", username);

        PrintWriter pw = resp.getWriter();

        if ("赵朝旭".equals(username)) {
            pw.write("no");
        } else {
            pw.write("yes");
        }
        pw.flush();
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");


        String username = req.getParameter("name");
        logger.debug("post用户名{}", username);


    }
}
