package com.ljh.dao;

import com.ljh.pojo.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeMapper {
    //添加一门成绩
    int addGrade(Grade grade);
    //删除一门成绩
    int deleteGrade(@Param("id")String id,@Param("CourseId")int CourseId);
    //修改一门成绩
    int updateGrade(Grade grade);
    //根据学号查询某个学生的成绩
    List<Grade> queryGradeById(Grade grade);
    //查询所有成绩
    List<Grade> queryGradeAll();
}
