package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.User;
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
public interface QuestionMapper {

    Question selectByPrimaryKey(Integer id);

    List<Question> selectByLibraryId(Integer id);

    int insert(Question question);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Question usquestioner);
}
