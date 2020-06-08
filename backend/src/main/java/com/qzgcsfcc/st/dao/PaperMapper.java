package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Paper;
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
public interface PaperMapper {

    Paper selectByPrimaryKey(Integer id);

    List<Paper> selectByCreator(Integer id);

    int insert(Paper paper);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Paper paper);
}
