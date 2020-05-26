package com.qzgcsfcc.st.model.relationship;

import lombok.Data;

import java.io.Serializable;

@Data
public class PaperQuestion implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer paperId;

    private Integer questionId;

    private Integer score;
}