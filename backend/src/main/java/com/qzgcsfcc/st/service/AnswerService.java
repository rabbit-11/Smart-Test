package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Answer;
import com.qzgcsfcc.st.model.param.ApiResult;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface AnswerService {

    ApiResult getByUser(Answer answer);

    ApiResult add(Answer answer);

    ApiResult edit(Answer answer);

    ApiResult delete(Integer id);
}
