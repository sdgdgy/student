package com.ljh.dao;

import com.ljh.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //增加一个学生
    int addStudent(Student student);
    //删除一个学生
    int deleteStudentById(@Param("id") String id);
    //修改一个学生
    int updateStudent(Student student);
    //查询一个学生
    List<Student> queryStudentById(@Param("id") String id);
    //查询全部学生
    List<Student> queryStudentAll();

    List<Student> queryStudentByClassId(@Param("classid")int classid);
}
