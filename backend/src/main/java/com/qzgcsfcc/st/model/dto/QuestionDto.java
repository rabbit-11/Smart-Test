package com.qzgcsfcc.st.model.dto;

import com.qzgcsfcc.st.model.Question;
import lombok.Data;

/**
 * @author dxc
 * @date 2020/6/2 20:40
 */
@Data
public class QuestionDto extends Question {
    private Integer score;
}
