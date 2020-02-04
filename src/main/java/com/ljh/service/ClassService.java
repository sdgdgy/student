package com.ljh.service;

import com.ljh.pojo.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassService {
    //添加一个班级
    int addClass(Class aClass);
    //删除一个班级
    int deleteClass(@Param("id")int id);
    //修改一个班级
    int updateClass(Class aClass);
    //根据id查询一个班级
    List<Class> queryClassById(@Param("id")int id);
    //查询所有班级
    List<Class> queryClassAll();

    List<Class> queryClassByDepartmentId(@Param("departmentid")int departmentid);
}
