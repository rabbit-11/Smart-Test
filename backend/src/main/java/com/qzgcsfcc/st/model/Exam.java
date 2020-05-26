package com.qzgcsfcc.st.model;
import lombok.Data;

import java.util.Date;

@Data
public class Exam {

    private Integer id;

    private String name;

    private Integer paperId;

    private Date createAt;

    private Integer creator;

    private Date startTime;

    private Date endTime;

    private Integer classId;

    private Integer status;
}
