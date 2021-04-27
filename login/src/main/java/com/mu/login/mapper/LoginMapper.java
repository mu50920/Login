package com.mu.login.mapper;

import com.mu.login.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface LoginMapper {
    @Select("Select * from user where username=#{username}")
    User Login(String username);


}
