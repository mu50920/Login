package com.mu.login.controller;

import com.mu.login.service.LoginService;
import com.mu.login.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.net.HttpCookie;

/**
 * @program: logintest
 * @description: 登录contorller
 * @author: Mr.Yang
 * @create: 2021-04-27 12:28
 **/
@Controller
public class LoginContorlloer {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session) {

      if(loginService.Login(username, password))
      {
          session.setAttribute("loginUser",username);
          return "index";
      }
        return "login";
    }

    @RequestMapping({"/","/index"})
    public String index()
    {
        return "index";
    }

}
