package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.UserClassMapper;
import com.qzgcsfcc.st.dao.UserMapper;
import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.dto.ClassDto;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.User;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserClassMapper userClassMapper;

    @Override
    public ApiResult login(User user) {
        User res = userMapper.select(user);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }

    @Override
    public ApiResult edit(User user) {

        userMapper.updateByPrimaryKey(user);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {

        userMapper.deleteByPrimaryKey(id);

        ApiResult apiResult =  new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult getClassInfo(Integer id) {

        List<ClassDto> res = userClassMapper.selectByUserId(id);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }

}
