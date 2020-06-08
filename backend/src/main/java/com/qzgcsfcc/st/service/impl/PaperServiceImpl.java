package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.PQMapper;
import com.qzgcsfcc.st.dao.PaperMapper;
import com.qzgcsfcc.st.model.Paper;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.PaperQuestion;
import com.qzgcsfcc.st.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxc
 * @since 2020/05/04
 */
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;
    @Autowired
    private PQMapper pqMapper;

    @Override
    public ApiResult add(Paper paper) {
        paperMapper.insert(paper);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult edit(Paper paper) {
        paperMapper.updateByPrimaryKey(paper);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        paperMapper.deleteByPrimaryKey(id);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult addQuestion(PaperQuestion paperQuestion) {
        pqMapper.insert(paperQuestion);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult editQuestion(PaperQuestion paperQuestion) {
        pqMapper.updateByPrimaryKey(paperQuestion);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delQuestion(PaperQuestion paperQuestion) {
        pqMapper.delete(paperQuestion);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult selectByCreator(Integer id) {
        List<Paper> paper = paperMapper.selectByCreator(id);
        ApiResult apiResult = new ApiResult();
        apiResult.success(paper);
        return apiResult;
    }
}
