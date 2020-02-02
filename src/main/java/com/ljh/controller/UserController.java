package com.ljh.controller;

import com.ljh.pojo.User;
import com.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @RequestMapping("login")
    public String login(User user, HttpSession httpSession){
        User user1= null;
        try {
            user1 = userService.queryUser(user).get(0);
            if(user1!=null){
                httpSession.setAttribute("username",user1.getId());
                if(user1.getIdentity()==0){
                    return "management";
                }else{
                    return "management";
                }
            }
            return "login";
        } catch (Exception e) {
            e.printStackTrace();
            return "login";
        }
    }
    @RequestMapping("logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "login";
    }
    @RequestMapping("updatePassword")
    public String updatePassword(String confirmpwd,HttpSession httpSession){
        User user=new User(httpSession.getAttribute("username").toString(),confirmpwd,0);
        userService.updateUser(user);
        return "management";
    }
}
