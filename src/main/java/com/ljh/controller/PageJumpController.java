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

import javax.servlet.http.HttpSession;
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
        return "admin/department";
    }
    @RequestMapping("toClass")
    public String toClass(Model model){
        model.addAttribute("classlist",classService.queryClassAll());
        return "admin/class";
    }
    @RequestMapping("toCourse")
    public String toCourse(Model model){
        model.addAttribute("courselist",courseService.queryCourseAll());
        return "admin/course";
    }
    @RequestMapping("toGrade")
    public String toGrade(Model model){
        model.addAttribute("gradelist",gradeService.queryGradeAll());
        return "admin/grade";
    }
    @RequestMapping("toStudent")
    public String toStudent(Model model){
        model.addAttribute("studentlist",studentService.queryStudentAll());
        return "admin/student";
    }
    @RequestMapping("toUser")
    public String toUser(Model model){
        model.addAttribute("userlist",userService.queryUserAll());
        return "admin/user";
    }
    @RequestMapping("toPersonalInformation")
    public String toPersonalInformation(Model model, HttpSession httpSession){
        String id=httpSession.getAttribute("username").toString();
        if(userService.queryUserById(id).get(0).getIdentity()!=1){
            model.addAttribute("identity","学生");
        }else{
            model.addAttribute("identity","管理员");
        }
        if(userService.queryUserById(id).get(0).getIdentity()!=1){
            model.addAttribute("personalName",studentService.queryStudentById(id).get(0).getName());
            model.addAttribute("className",classService.queryClassById(studentService.queryStudentById(id).get(0).getClassId()).get(0).getClassName());
            model.addAttribute("departmentName",departmentService.queryDepartmentById(classService.queryClassById(studentService.queryStudentById(id).get(0).getClassId()).get(0).getDepartmentId()).get(0).getDepartmentName());
        }
        return "admin/personalInformation";
    }
    @RequestMapping("toUpdatePassword")
    public String toUpdatePassword(){
        return "admin/updatePassword";
    }
    @RequestMapping("toManagement")
    public String toManagement(Model model){
        model.addAttribute("allMessageList",gradeService.queryAllMessage());
        return "admin/management";
    }
    @RequestMapping("toUpdateDepartment")
    public String toUpdateDepartment(int id, Model model){
        model.addAttribute("departmentOne",departmentService.queryDepartmentById(id));
        return "admin/updateDepartment";
    }
    @RequestMapping("toAddDepartment")
    public String toAddDepartment(){
        return "admin/addDepartment";
    }
    @RequestMapping("toAddClass")
    public String toAddClass(Model model){
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        return "admin/addClass";
    }
    @RequestMapping("toUpdateClass")
    public String toUpdateClass(int id, Model model){
        List<Class> list=classService.queryClassById(id);
        model.addAttribute("classOne",list);
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        model.addAttribute("classOne_department",departmentService.queryDepartmentById(list.get(0).getDepartmentId()));
        return "admin/updateClass";
    }
    @RequestMapping("toAddCourse")
    public String toAddCourse(){
        return "admin/addCourse";
    }
    @RequestMapping("toUpdateCourse")
    public String toUpdateCourse(int id,Model model){
        model.addAttribute("courseOne",courseService.queryCourseById(id));
        return "admin/updateCourse";
    }
    @RequestMapping("toUpdateUser")
    public String toUpdateUser(String id,Model model){
        model.addAttribute("userOne",userService.queryUserById(id));
        return "admin/updateUser";
    }
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "admin/addUser";
    }
    @RequestMapping("toAddStudent")
    public String toAddStudent(Model model){
        model.addAttribute("classlist",classService.queryClassAll());
        return "admin/addStudent";
    }
    @RequestMapping("toUpdateStudent")
    public String toUpdateStudent(String id,Model model){
        List<Student> list = studentService.queryStudentById(id);
        model.addAttribute("studentOne",list);
        model.addAttribute("classlist",classService.queryClassAll());
        model.addAttribute("studentOne_class",classService.queryClassById(list.get(0).getClassId()));
        return "admin/updateStudent";
    }
    @RequestMapping("toAddGrade")
    public String toAddGrade(Model model){
        model.addAttribute("departmentlist",departmentService.queryDepartmentAll());
        model.addAttribute("courselist",courseService.queryCourseAll());
        return "admin/addGrade";
    }
    @RequestMapping("toUpdateGrade")
    public String toUpdateGrade(Model model,String id,int courseid){
        Grade grade=new Grade(id,courseid,0);
        model.addAttribute("gradeOne",gradeService.queryGradeById(grade));
        model.addAttribute("courselist",courseService.queryCourseAll());
        model.addAttribute("gradeOne_course",courseService.queryCourseById(courseid));
        return "admin/updateGrade";
    }
    @RequestMapping("toStudentPage")
    public String toStudentPage(Model model,HttpSession httpSession){
        model.addAttribute("studentMessageList",userService.queryStudentMessage(httpSession.getAttribute("username").toString()));
        return "student/index_student";
    }
    @RequestMapping("toPersonalInformation_student")
    public String toPersonalInformation_student(Model model,HttpSession httpSession){
        String id=httpSession.getAttribute("username").toString();
        if(userService.queryUserById(id).get(0).getIdentity()!=1){
            model.addAttribute("identity","学生");
        }else{
            model.addAttribute("identity","管理员");
        }
        if(userService.queryUserById(id).get(0).getIdentity()!=1){
            model.addAttribute("personalName",studentService.queryStudentById(id).get(0).getName());
            model.addAttribute("className",classService.queryClassById(studentService.queryStudentById(id).get(0).getClassId()).get(0).getClassName());
            model.addAttribute("departmentName",departmentService.queryDepartmentById(classService.queryClassById(studentService.queryStudentById(id).get(0).getClassId()).get(0).getDepartmentId()).get(0).getDepartmentName());
        }else{

        }
        return "student/personalInformation_student";
    }
    @RequestMapping("toUpdatePassword_student")
    public String toUpdatePassword_student(){
        return "student/updatePassword_student";
    }
}
