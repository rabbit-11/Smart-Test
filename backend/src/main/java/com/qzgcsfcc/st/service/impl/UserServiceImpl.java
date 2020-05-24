package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.UserMapper;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

    @Override
    public ApiResult login(User user) {
        User res = userMapper.select(user);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }
}
