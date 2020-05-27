package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.User;
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
public interface ClassMapper {

    List<User> selectStu(Integer id);

    ClassInfo selectByPrimaryKey(Integer id);

    List<ClassInfo> selectByTeacherId(Integer teacherId);

    int insert(ClassInfo classInfo);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(ClassInfo classInfo);
}
