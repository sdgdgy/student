package com.ljh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentMessage {
    private String id;
    private String name;
    private int CourseId;
    private String CourseName;
    private int Credit;
    private double Mark;
}
