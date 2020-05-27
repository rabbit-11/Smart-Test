package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.AnswerMapper;
import com.qzgcsfcc.st.model.Answer;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxc
 * @since 2020/05/04
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public ApiResult add(Answer answer) {
        answerMapper.insert(answer);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult edit(Answer answer) {
        answerMapper.updateByPrimaryKey(answer);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        answerMapper.deleteByPrimaryKey(id);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }
}
