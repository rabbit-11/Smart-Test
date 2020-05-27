package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.ClassMapper;
import com.qzgcsfcc.st.dao.LibraryMapper;
import com.qzgcsfcc.st.dao.UserClassMapper;
import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.UserClass;
import com.qzgcsfcc.st.service.ClassService;
import com.qzgcsfcc.st.service.LibraryService;
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
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryMapper libraryMapper;

    @Override
    public ApiResult add(Library library) {
        libraryMapper.insert(library);

        ApiResult apiResult = new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult edit(Library library) {
        libraryMapper.updateByPrimaryKey(library);

        ApiResult apiResult = new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        libraryMapper.deleteByPrimaryKey(id);

        ApiResult apiResult = new ApiResult();

        return apiResult;
    }
}
