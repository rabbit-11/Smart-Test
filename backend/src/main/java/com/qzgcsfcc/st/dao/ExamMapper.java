package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Exam;
import com.qzgcsfcc.st.model.dto.ExamDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dxc
 * @since 2020-5-4
 */
@Repository
public interface ExamMapper {

    Exam selectByPrimaryKey(Integer id);

    int insert(Exam exam);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Exam exam);

    List<ExamDto> selectByClass(Integer id);

    int openExam(Integer id);
}
