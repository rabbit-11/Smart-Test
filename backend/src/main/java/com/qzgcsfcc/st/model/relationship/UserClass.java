package com.qzgcsfcc.st.model.relationship;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserClass implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private Integer classId;
}