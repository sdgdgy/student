package com.ljh.dao;

import com.ljh.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //增加一个User
    int addUser(User user);
    //修改一个User
    int updateUser(User user);
    //删除一个User
    int deleteUser(@Param("id") String id);
    //查询一个User
    List<User> queryUserById(@Param("id") String id);
    //查询全部User
    List<User> queryUserAll();

    List<User> queryUser(User user);
}
