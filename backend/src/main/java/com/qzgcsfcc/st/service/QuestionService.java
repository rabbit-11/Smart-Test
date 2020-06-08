package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.param.ApiResult;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface QuestionService {

    ApiResult add(Question question);

    ApiResult edit(Question question);

    ApiResult delete(Integer id);

    ApiResult selectByPaper(Integer id);
}
