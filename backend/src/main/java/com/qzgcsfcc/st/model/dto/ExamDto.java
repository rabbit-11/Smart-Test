package com.qzgcsfcc.st.model.dto;

import com.qzgcsfcc.st.model.Exam;
import lombok.Data;

/**
 * @author dxc
 * @date 2020/5/28 0:37
 */

@Data
public class ExamDto extends Exam {
    private String teacherName;
    private String paperName;
}
