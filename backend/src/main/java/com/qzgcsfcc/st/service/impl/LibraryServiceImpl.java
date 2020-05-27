package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.ClassMapper;
import com.qzgcsfcc.st.dao.LibraryMapper;
import com.qzgcsfcc.st.dao.QLMapper;
import com.qzgcsfcc.st.dao.UserClassMapper;
import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.QuestionLibrary;
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

    @Autowired
    private QLMapper qlMapper;

    @Override
    public ApiResult getAll(Library library) {

        List<Library> libraries = libraryMapper.selectAll(library);

        ApiResult apiResult = new ApiResult();

        apiResult.success(libraries);

        return apiResult;
    }

    @Override
    public ApiResult getAllQuestion(Integer id) {

        List<Question> questions = libraryMapper.selectAllQuestion(id);

        ApiResult apiResult = new ApiResult();

        apiResult.success(questions);

        return apiResult;
    }

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

    @Override
    public ApiResult addQuestion(QuestionLibrary questionLibrary) {
        qlMapper.insert(questionLibrary);

        ApiResult apiResult = new ApiResult();

        return apiResult;
    }

    @Override
    public ApiResult delQuestion(QuestionLibrary questionLibrary) {
        qlMapper.delete(questionLibrary);

        ApiResult apiResult = new ApiResult();

        return apiResult;
    }
}
