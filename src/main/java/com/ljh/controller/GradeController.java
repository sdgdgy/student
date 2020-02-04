package com.ljh.controller;

import com.google.gson.Gson;
import com.ljh.pojo.Grade;
import com.ljh.pojo.User;
import com.ljh.service.ClassService;
import com.ljh.service.GradeService;
import com.ljh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    @Qualifier("GradeServiceImpl")
    private GradeService gradeService;
    @Autowired
    @Qualifier("ClassServiceImpl")
    private ClassService classService;
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @RequestMapping("del")
    public String del(String id,int courseid){
        gradeService.deleteGrade(id,courseid);
        return "redirect:/PageJump/toGrade";
    }
    @RequestMapping("add")
    public String add(Grade grade,Model model){
        try {
            gradeService.addGrade(grade);
            return "redirect:/PageJump/toGrade";
        } catch (Exception e) {
            model.addAttribute("msg","成绩添加重复或者输入不规范");
            return "addGrade";
        }
    }
    @RequestMapping("update")
    public String update(Grade grade){
            gradeService.updateGrade(grade);
            return "redirect:/PageJump/toGrade";
    }
    @RequestMapping(value = "queryClassByDepartmentId",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String queryClassByDepartmentId(int id){
        Gson gson=new Gson();
        return gson.toJson(classService.queryClassByDepartmentId(id));
    }
    @RequestMapping(value = "queryStudentByClassId",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String queryStudentByClassId(int id){
        Gson gson=new Gson();
        return gson.toJson(studentService.queryStudentByClassId(id));
    }
}

