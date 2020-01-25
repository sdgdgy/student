package com.ljh.service;

import com.ljh.dao.DepartmentMapper;
import com.ljh.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public int addDepartment(Department department) {
        departmentMapper.addDepartment(department);
        return 1;
    }

    public int deleteDepartment(int id) {
        departmentMapper.deleteDepartment(id);
        return 1;
    }

    public int updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
        return 1;
    }

    public List<Department> queryDepartmentById(int id) {
        return departmentMapper.queryDepartmentById(id);
    }

    public List<Department> queryDepartmentAll() {
        return departmentMapper.queryDepartmentAll();
    }
}
