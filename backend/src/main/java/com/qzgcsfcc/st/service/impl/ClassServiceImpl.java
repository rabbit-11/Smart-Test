package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.ClassMapper;
import com.qzgcsfcc.st.dao.UserClassMapper;
import com.qzgcsfcc.st.dao.UserMapper;
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


    @Override
    public ApiResult getStu(Integer id) {

        List<User> res = classMapper.selectStu(id);

        ApiResult apiResult =  new ApiResult();

        apiResult.success(res);
        return apiResult;
    }

    @Override
    public ApiResult add(UserClass userClass) {
        return null;
    }

    @Override
    public ApiResult delete(UserClass userClass) {
        return null;
    }
}
