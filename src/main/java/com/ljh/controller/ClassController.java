package com.ljh.controller;

import com.ljh.pojo.Class;
import com.ljh.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("class")
public class ClassController {
    @Autowired
    @Qualifier("ClassServiceImpl")
    private ClassService classService;
    @RequestMapping("add")
    public String add(String ClassName,int DepartmentId){
        Class aClass=new Class(0,ClassName,DepartmentId);
        classService.addClass(aClass);
        return "redirect:/PageJump/toClass";
    }
    @RequestMapping("del")
    public String del(int id){
        classService.deleteClass(id);
        return "redirect:/PageJump/toClass";
    }
    @RequestMapping("update")
    public String update(Class aClass){
        classService.updateClass(aClass);
        return "redirect:/PageJump/toClass";
    }
}
