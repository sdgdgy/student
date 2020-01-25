package com.ljh.service;

import com.ljh.dao.CourseMapper;
import com.ljh.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public void setCourseMapper(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public int addCourse(Course course) {
        courseMapper.addCourse(course);
        return 1;
    }

    public int deleteCourse(int id) {
        courseMapper.deleteCourse(id);
        return 1;
    }

    public int updateCourse(Course course) {
        courseMapper.updateCourse(course);
        return 1;
    }

    public List<Course> queryCourseById(int id) {
        return courseMapper.queryCourseById(id);
    }

    public List<Course> queryCourseAll() {
        return courseMapper.queryCourseAll();
    }
}
