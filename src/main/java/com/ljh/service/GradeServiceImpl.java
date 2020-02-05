package com.ljh.service;

import com.ljh.dao.GradeMapper;
import com.ljh.pojo.AllMessage;
import com.ljh.pojo.Grade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    public void setGradeMapper(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

    public int addGrade(Grade grade) {
        gradeMapper.addGrade(grade);
        return 1;
    }

    public int deleteGrade(String id, int CourseId) {
        gradeMapper.deleteGrade(id,CourseId);
        return 1;
    }

    public int updateGrade(Grade grade) {
        gradeMapper.updateGrade(grade);
        return 1;
    }

    public List<Grade> queryGradeById(Grade grade) {
        return gradeMapper.queryGradeById(grade);
    }

    public List<Grade> queryGradeAll() {
        return gradeMapper.queryGradeAll();
    }

    public List<AllMessage> queryAllMessage() {
        return gradeMapper.queryAllMessage();
    }
}
