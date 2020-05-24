package com.qzgcsfcc.st.service;

import com.qzgcsfcc.st.model.ApiResult;
import com.qzgcsfcc.st.model.User;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dxc
 * @since 2020-4-22
 */
@Service
public interface UserService {

    ApiResult login(User user);
}
