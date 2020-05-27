package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.dto.ClassDto;
import com.qzgcsfcc.st.model.relationship.UserClass;
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
public interface UserClassMapper {

    List<ClassDto> selectByUserId(Integer id);

    int insert(UserClass userClass);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(UserClass userClass);
}
