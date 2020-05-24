package com.qzgcsfcc.st.dao;

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
public interface ClassMapper {

    Class selectByPrimaryKey(Integer id);

    List<Class> selectByTeacherId(Integer teacherId);

    int insert(Class classInfo);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(User user);
}
