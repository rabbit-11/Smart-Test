package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.ExamMapper;
import com.qzgcsfcc.st.model.Exam;
import com.qzgcsfcc.st.model.dto.ExamDto;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.ExamService;
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
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public ApiResult add(Exam exam) {
        examMapper.insert(exam);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult edit(Exam exam) {
        examMapper.updateByPrimaryKey(exam);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        examMapper.deleteByPrimaryKey(id);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult getByClass(Integer id) {
        List<ExamDto> exams = examMapper.selectByClass(id);
        ApiResult apiResult = new ApiResult();
        apiResult.success(exams);
        return apiResult;
    }

    @Override
    public ApiResult getByUser(Integer id) {
        List<ExamDto> exams = examMapper.selectByUser(id);
        ApiResult apiResult = new ApiResult();
        apiResult.success(exams);
        return apiResult;
    }
}
