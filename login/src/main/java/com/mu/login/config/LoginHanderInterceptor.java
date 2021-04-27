package com.mu.login.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: login
 * @description:
 * @author: Mr.Yang
 * @create: 2021-04-27 15:40
 **/
public class LoginHanderInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Object loginUser =  request.getSession().getAttribute("loginUser");
      if(loginUser==null)
      {
          request.setAttribute("msg","没有权限请先登陆");
          request.getRequestDispatcher("/login.html").forward(request,response);
          return false;
      }
        return true;
    }

}
