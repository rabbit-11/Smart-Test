package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Paper;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.PaperQuestion;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface PaperService {

    ApiResult add(Paper paper);

    ApiResult edit(Paper paper);

    ApiResult delete(Integer id);

    ApiResult addQuestion(PaperQuestion paperQuestion);

    ApiResult editQuestion(PaperQuestion paperQuestion);

    ApiResult delQuestion(PaperQuestion paperQuestion);

    ApiResult selectByCreator(Integer id);
}
