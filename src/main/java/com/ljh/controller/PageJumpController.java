package com.ljh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/PageJump")
public class PageJumpController {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("toDepartment")
    public String toDepartment(){
        return "department";
    }
    @RequestMapping("toClass")
    public String toClass(){
        return "class";
    }
    @RequestMapping("toCourse")
    public String toCourse(){
        return "course";
    }
    @RequestMapping("toGrade")
    public String toGrade(){
        return "grade";
    }
    @RequestMapping("toStudent")
    public String toStudent(){
        return "student";
    }
    @RequestMapping("toUser")
    public String toUser(){
        return "user";
    }
    @RequestMapping("toPersonalInformation")
    public String toPersonalInformation(){
        return "personalInformation";
    }
    @RequestMapping("toUpdatePassword")
    public String toUpdatePassword(){
        return "updatePassword";
    }
    @RequestMapping("toManagement")
    public String toManagement(){
        return "management";
    }
}
