package com.qzgcsfcc.st.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClassInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer teacherId;

    private Integer status;
}