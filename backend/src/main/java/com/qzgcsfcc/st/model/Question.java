package com.qzgcsfcc.st.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createAt;

    private Integer creator;

    private String content;

    private String answer;

    private Integer type;

    private Integer status;
}