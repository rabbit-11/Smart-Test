package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.model.dto.ClassDto;
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
public interface UserMapper {

    User select(User users);

    int insert(User user);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(User user);
}
