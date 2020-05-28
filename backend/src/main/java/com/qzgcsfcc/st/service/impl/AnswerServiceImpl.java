package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.AnswerMapper;
import com.qzgcsfcc.st.model.Answer;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.AnswerService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    public ApiResult getByUser(Answer answer) {
        List<Answer> answers = answerMapper.selectByUser(answer);
        ApiResult apiResult = new ApiResult();
        apiResult.success(initAnswers(answers));
        return apiResult;
    }

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

    private Integer cal(List<Answer> answers){
        Integer total = 0;
        for (Answer answer : answers) {
            total += answer.getScore();
        }
        return total;
    }
    private Map initAnswers(List<Answer> answers){
        Map res = new HashMap(2);
        Integer total = cal(answers);
        res.put("total",total);
        res.put("answer",answers);
        return res;
    }
}
