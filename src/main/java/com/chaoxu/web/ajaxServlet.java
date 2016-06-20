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
@WebServlet("/testajax")
public class ajaxServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(ajaxServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.write("zcx");
        pw.flush();
        pw.close();
    }

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //String name = req.getParameter("name");
        String age = req.getParameter("age");
        logger.debug("post输出的用户{}",age);

    }
}
