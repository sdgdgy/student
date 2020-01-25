package com.ljh.service;

import com.ljh.dao.StudentMapper;
import com.ljh.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(Student student) {
        studentMapper.addStudent(student);
        return 1;
    }

    public int deleteStudentById(String id) {
        studentMapper.deleteStudentById(id);
        return 1;
    }

    public int updateStudent(Student student) {
        studentMapper.updateStudent(student);
        return 1;
    }

    public List<Student> queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }

    public List<Student> queryStudentAll() {
        return studentMapper.queryStudentAll();
    }
}
