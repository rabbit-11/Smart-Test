package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Exam;
import com.qzgcsfcc.st.model.param.ApiResult;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface ExamService {

    ApiResult add(Exam exam);

    ApiResult edit(Exam exam);

    ApiResult delete(Integer id);

    ApiResult getByClass(Integer id);

    ApiResult getByUser(Integer id);

    ApiResult openExam(Integer id);
}
