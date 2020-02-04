package com.ljh.controller;

import com.ljh.pojo.Class;
import com.ljh.pojo.Grade;
import com.ljh.pojo.Student;
import com.ljh.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/PageJump")
public class PageJumpController {
    @Autowired
    @Qualifier("DepartmentServiceImpl")
    private DepartmentService departmentService;
    @Autowired
    @Qualifier("ClassServiceImpl")
    private ClassService classService;
    @Autowired
    @Qualifier("CourseServiceImpl")
    private CourseService courseService;
    @Autowired
    @Qualifier("GradeServiceImpl")
    private GradeService gradeService;
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("toDepartment")
    public String toDepartment(Model model){
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        return "department";
    }
    @RequestMapping("toClass")
    public String toClass(Model model){
        model.addAttribute("classlist",classService.queryClassAll());
        return "class";
    }
    @RequestMapping("toCourse")
    public String toCourse(Model model){
        model.addAttribute("courselist",courseService.queryCourseAll());
        return "course";
    }
    @RequestMapping("toGrade")
    public String toGrade(Model model){
        model.addAttribute("gradelist",gradeService.queryGradeAll());
        return "grade";
    }
    @RequestMapping("toStudent")
    public String toStudent(Model model){
        model.addAttribute("studentlist",studentService.queryStudentAll());
        return "student";
    }
    @RequestMapping("toUser")
    public String toUser(Model model){
        model.addAttribute("userlist",userService.queryUserAll());
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
    @RequestMapping("toUpdateDepartment")
    public String toUpdateDepartment(int id, Model model){
        model.addAttribute("departmentOne",departmentService.queryDepartmentById(id));
        return "updateDepartment";
    }
    @RequestMapping("toAddDepartment")
    public String toAddDepartment(){
        return "addDepartment";
    }
    @RequestMapping("toAddClass")
    public String toAddClass(Model model){
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        return "addClass";
    }
    @RequestMapping("toUpdateClass")
    public String toUpdateClass(int id, Model model){
        List<Class> list=classService.queryClassById(id);
        model.addAttribute("classOne",list);
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        model.addAttribute("classOne_department",departmentService.queryDepartmentById(list.get(0).getDepartmentId()));
        return "updateClass";
    }
    @RequestMapping("toAddCourse")
    public String toAddCourse(){
        return "addCourse";
    }
    @RequestMapping("toUpdateCourse")
    public String toUpdateCourse(int id,Model model){
        model.addAttribute("courseOne",courseService.queryCourseById(id));
        return "updateCourse";
    }
    @RequestMapping("toUpdateUser")
    public String toUpdateUser(String id,Model model){
        model.addAttribute("userOne",userService.queryUserById(id));
        return "updateUser";
    }
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }
    @RequestMapping("toAddStudent")
    public String toAddStudent(Model model){
        model.addAttribute("classlist",classService.queryClassAll());
        return "addStudent";
    }
    @RequestMapping("toUpdateStudent")
    public String toUpdateStudent(String id,Model model){
        List<Student> list = studentService.queryStudentById(id);
        model.addAttribute("studentOne",list);
        model.addAttribute("classlist",classService.queryClassAll());
        model.addAttribute("studentOne_class",classService.queryClassById(list.get(0).getClassId()));
        return "updateStudent";
    }
    @RequestMapping("toAddGrade")
    public String toAddGrade(Model model){
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        model.addAttribute("courselist",courseService.queryCourseAll());
        return "addGrade";
    }
    @RequestMapping("toUpdateGrade")
    public String toUpdateGrade(Model model,String id,int courseid){
        Grade grade=new Grade(id,courseid,0);
        model.addAttribute("gradeOne",gradeService.queryGradeById(grade));
        model.addAttribute("courselist",courseService.queryCourseAll());
        model.addAttribute("gradeOne_course",courseService.queryCourseById(courseid));
        return "updateGrade";
    }
}
