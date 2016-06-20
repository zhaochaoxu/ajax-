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
        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("username");
        logger.debug("用户名为{}：", username);


        PrintWriter pw = resp.getWriter();

        if ("zcx".equals(username)) {
            pw.write("no");
        } else {
            pw.write("yes");
        }

        pw.flush();
        pw.close();

    }
}
