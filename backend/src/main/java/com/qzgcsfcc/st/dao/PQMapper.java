package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.relationship.PaperQuestion;
import com.qzgcsfcc.st.model.relationship.QuestionLibrary;
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
public interface PQMapper {

    int insert(PaperQuestion paperQuestion);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(PaperQuestion paperQuestion);
}
