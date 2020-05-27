package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.QuestionMapper;
import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.QuestionService;
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
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public ApiResult add(Question question) {
        questionMapper.insert(question);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult edit(Question question) {
        questionMapper.updateByPrimaryKey(question);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        questionMapper.deleteByPrimaryKey(id);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }
}
