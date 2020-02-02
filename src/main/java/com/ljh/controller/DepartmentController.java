package com.ljh.controller;

import com.ljh.pojo.Department;
import com.ljh.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    @Qualifier("DepartmentServiceImpl")
    private DepartmentService departmentService;
    @RequestMapping("del")
    public String del(int id){
        departmentService.deleteDepartment(id);
        return "redirect:/PageJump/toDepartment";
    }
    @RequestMapping("update")
    public String update(Department department){
        departmentService.updateDepartment(department);
        return "redirect:/PageJump/toDepartment";
    }
    @RequestMapping("add")
    public String add(String DepartmentName){
        departmentService.addDepartment(DepartmentName);
        return "redirect:/PageJump/toDepartment";
    }
}
