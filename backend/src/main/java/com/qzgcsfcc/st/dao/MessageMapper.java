package com.qzgcsfcc.st.dao;

import com.qzgcsfcc.st.model.Message;
import com.qzgcsfcc.st.model.dto.MessageDto;
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
public interface MessageMapper {

    List<MessageDto> selectById(Integer id);

    int insert(Message message);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Message message);
}
