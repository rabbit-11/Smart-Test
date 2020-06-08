package com.qzgcsfcc.st.model.dto;

import com.qzgcsfcc.st.model.Answer;
import lombok.Data;

/**
 * @author dxc
 * @date 2020/6/4 20:00
 */

@Data
public class AnswerDto extends Answer {
    private Integer isRead;
    private String paperId;
}
