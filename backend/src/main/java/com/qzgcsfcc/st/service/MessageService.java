package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.Message;
import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.param.ApiResult;

/**
 * @author dxc
 * @date 2020/5/27 22:18
 */

public interface MessageService {

    ApiResult getList(Integer id);

    ApiResult add(Message message);

    ApiResult edit(Message message);

    ApiResult delete(Integer id);
}
