package com.qzgcsfcc.st.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Paper implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date createAt;

    private Integer creator;

    private String name;

    private Integer score;

    private Integer status;

    private Integer type;
}