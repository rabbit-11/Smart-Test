package com.qzgcsfcc.st.service.impl;

import com.qzgcsfcc.st.dao.MessageMapper;
import com.qzgcsfcc.st.model.Message;
import com.qzgcsfcc.st.model.dto.MessageDto;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.MessageService;
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
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public ApiResult getList(Integer id) {
        List<MessageDto> messages =  messageMapper.selectById(id);
        ApiResult apiResult = new ApiResult();
        apiResult.success(messages);
        return apiResult;
    }

    @Override
    public ApiResult add(Message message) {
        messageMapper.insert(message);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult edit(Message message) {
        messageMapper.updateByPrimaryKey(message);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }

    @Override
    public ApiResult delete(Integer id) {
        messageMapper.deleteByPrimaryKey(id);
        ApiResult apiResult = new ApiResult();
        return apiResult;
    }
}
