package com.mu.login.service;

import com.mu.login.bean.User;
import com.mu.login.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @program: logintest
 * @description:
 * @author: Mr.Yang
 * @create: 2021-04-27 12:31
 **/
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean Login(String username, String password) {
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password))return false;
        User user = loginMapper.Login(username);
        if(user!=null&&user.getPassword().equals(password))return true;
        return false;
    }
}

