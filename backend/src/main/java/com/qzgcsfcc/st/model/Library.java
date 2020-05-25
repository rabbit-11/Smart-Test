package com.qzgcsfcc.st.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Library implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Date createAt;

    private Integer creator;

    private Integer status;
}