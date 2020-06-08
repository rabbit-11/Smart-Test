package com.qzgcsfcc.st.model;
import lombok.Data;

import java.util.Date;

@Data
public class Answer {

    private Integer id;

    private Integer userId;

    private Integer examId;

    private Integer questionId;

    private String content;

    private Integer score;

    private Integer isCheck;
}
