package com.ljh.controller;

import com.ljh.pojo.Student;
import com.ljh.pojo.User;
import com.ljh.service.StudentService;
import com.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @RequestMapping("add")
    public String add(Student student, Model model){
        User user=new User(student.getId(),student.getId(),0);
        try {
            studentService.addStudent(student);
            userService.addUser(user);
            return "redirect:/PageJump/toStudent";
        } catch (Exception e) {
            model.addAttribute("msg","已存在学生");
            return "addStudent";
        }
    }
    @RequestMapping("del")
    public String del(String id){
        studentService.deleteStudentById(id);
        userService.deleteUser(id);
        return "redirect:/PageJump/toStudent";
    }
    @RequestMapping("update")
    public String update(Student student){
        studentService.updateStudent(student);
        return "redirect:/PageJump/toStudent";
    }
}
