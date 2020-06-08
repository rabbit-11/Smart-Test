package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.ClassMapper;
import com.qzgcsfcc.st.dao.UserClassMapper;
import com.qzgcsfcc.st.dao.UserMapper;
import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.model.dto.ClassDto;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.UserClass;
import com.qzgcsfcc.st.service.ClassService;
import com.qzgcsfcc.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxc
 * @since 2020/05/04
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private UserClassMapper userClassMapper;


    @Override
    public ApiResult getStu(Integer id) {

        List<User> res = classMapper.selectStu(id);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }

    @Override
    public ApiResult getClassByTeacher(Integer id) {


        List<ClassInfo> res = classMapper.selectByTeacherId(id);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }

    @Override
    public ApiResult addStu(UserClass userClass) {

        userClassMapper.insert(userClass);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult deleteStu(UserClass userClass) {

        userClassMapper.delete(userClass);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {

        classMapper.deleteByPrimaryKey(id);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult add(ClassInfo classInfo) {

        classMapper.insert(classInfo);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult edit(ClassInfo classInfo) {

        classMapper.updateByPrimaryKey(classInfo);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }
}
