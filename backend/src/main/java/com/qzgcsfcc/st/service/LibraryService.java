package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.param.ApiResult;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface LibraryService {

    ApiResult add(Library library);

    ApiResult edit(Library library);

    ApiResult delete(Integer id);
}
