package com.ljh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllMessage {
    private int DepartmentId;
    private String DepartmentName;
    private int classId;
    private String className;
    private String id;
    private String name;
    private int CourseId;
    private String CourseName;
    private int Credit;
    private double Mark;
}
