package com.ljh.service;

import com.ljh.dao.ClassMapper;
import com.ljh.pojo.Class;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassMapper classMapper;

    public void setClassMapper(ClassMapper classMapper) {
        this.classMapper = classMapper;
    }

    public int addClass(Class aClass) {
        classMapper.addClass(aClass);
        return 1;
    }

    public int deleteClass(int id) {
        classMapper.deleteClass(id);
        return 1;
    }

    public int updateClass(Class aClass) {
        classMapper.updateClass(aClass);
        return 1;
    }

    public List<Class> queryClassById(int id) {
        return classMapper.queryClassById(id);
    }

    public List<Class> queryClassAll() {
        return classMapper.queryClassAll();
    }

    public List<Class> queryClassByDepartmentId(int departmentid) {
        return classMapper.queryClassByDepartmentId(departmentid);
    }
}
