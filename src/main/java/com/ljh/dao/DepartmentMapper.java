package com.ljh.dao;

import com.ljh.pojo.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    //添加一个系别
    int addDepartment(String department);
    //删除一个系别
    int deleteDepartment(@Param("id") int id);
    //修改一个系别
    int updateDepartment(Department department);
    //根据id查询一个系别
    List<Department> queryDepartmentById(@Param("id") int id);
    //查询所有系别
    List<Department> queryDepartmentAll();
}
