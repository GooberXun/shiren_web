package com.dongao.phoenix.shiren.util;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Goober on 2018/1/2.
 */

public class HttpClientUtil extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        PrintWriter pw = response.getWriter();
        pw.print("您使用GET方式请求该Servlet。<br />" + "name = " + name + ",age = " + age);
        pw.flush();
        pw.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        PrintWriter pw = response.getWriter();
        pw.print("您使用POST方式请求该Servlet。<br />" + "name = " + name + ",age = " + age);
        pw.flush();
        pw.close();
    }
}
