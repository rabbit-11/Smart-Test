package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Answer;
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
public interface AnswerMapper {

    List<Answer> selectByUser(Answer answer);

    int insert(Answer answer);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Answer answer);
}
