package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.Question;
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
public interface LibraryMapper {

    Library selectByPrimaryKey(Integer id);

    List<Question> selectAllQuestion(Integer id);

    List<Library> selectAll(Library library);

    int insert(Library library);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Library library);
}
