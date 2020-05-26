package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Answer;
import org.springframework.stereotype.Repository;

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


    int insert(Answer answer);

    int deleteByPrimaryKey(Integer id);


    int updateByPrimaryKey(Answer answer);
}
