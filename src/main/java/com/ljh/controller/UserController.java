package com.ljh.controller;

import com.ljh.pojo.User;
import com.ljh.service.GradeService;
import com.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @Autowired
    @Qualifier("GradeServiceImpl")
    private GradeService gradeService;
    @RequestMapping("login")
    public String login(User user, HttpSession httpSession,Model model){
        User user1= null;
        try {
            user1 = userService.queryUser(user).get(0);
            if(user1!=null){
                httpSession.setAttribute("username",user1.getId());
                if(user1.getIdentity()==0){
                    return "management";
                }else{
                    model.addAttribute("allMessageList",gradeService.queryGradeAll());
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
    @RequestMapping("del")
    public String del(String id){
        userService.deleteUser(id);
        return "redirect:/PageJump/toUser";
    }
    @RequestMapping("add")
    public String add(User user, Model model){
        try {
            userService.addUser(user);
            return "redirect:/PageJump/toUser";
        } catch (Exception e) {
            model.addAttribute("msg","已存在用户");
            return "addUser";
        }
    }
    @RequestMapping("update")
    public String update(User user){
        userService.updateUser(user);
        return "redirect:/PageJump/toUser";
    }
    @RequestMapping(value = "updateIdentity",produces="text/html;charset=UTF-8")
    @ResponseBody
    public void updateIdentity(String id,String password,int identity){
        User user=new User(id,password,identity);
        userService.updateUser(user);
    }
}
