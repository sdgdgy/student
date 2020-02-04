package com.ljh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private String id;
    private int CourseId;
    private double Mark;
}
