package com.ljh.controller;

import com.ljh.pojo.Course;
import com.ljh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("course")
public class CourseController {
    @Autowired
    @Qualifier("CourseServiceImpl")
    private CourseService courseService;
    @RequestMapping("add")
    public String add(Course course){
        courseService.addCourse(course);
        return "redirect:/PageJump/toCourse";
    }
    @RequestMapping("del")
    public String del(int id){
        courseService.deleteCourse(id);
        return "redirect:/PageJump/toCourse";
    }
    @RequestMapping("update")
    public String update(Course course){
        courseService.updateCourse(course);
        return "redirect:/PageJump/toCourse";
    }
}
