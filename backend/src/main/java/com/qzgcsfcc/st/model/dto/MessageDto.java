package com.qzgcsfcc.st.model.dto;

import com.qzgcsfcc.st.model.Message;
import lombok.Data;

/**
 * @author dxc
 * @date 2020/5/31 13:28
 */

@Data
public class MessageDto extends Message {
    private String senderName;
}
