package com.ljh.service;

import com.ljh.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseService {
    //添加一门课程
    int addCourse(Course course);
    //删除一门课程
    int deleteCourse(@Param("id") int id);
    //修改一门课程信息
    int updateCourse(Course course);
    //根据课程号查询一门课程信息
    List<Course> queryCourseById(@Param("id") int id);
    //查询所有课程信息
    List<Course> queryCourseAll();
}
