package com.qzgcsfcc.st.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    private String mobile;

    private String role;

    private String avatar;

    private String sex;

    private Integer status;
}