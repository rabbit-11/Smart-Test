package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.QuestionLibrary;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface LibraryService {

    ApiResult getAll(Library library);

    ApiResult getAllQuestion(Integer id);

    ApiResult add(Library library);

    ApiResult edit(Library library);

    ApiResult delete(Integer id);

    ApiResult addQuestion(QuestionLibrary questionLibrary);

    ApiResult delQuestion(QuestionLibrary questionLibrary);
}
