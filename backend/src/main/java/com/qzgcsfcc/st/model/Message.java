package com.qzgcsfcc.st.model;

import lombok.Data;

import java.util.Date;

/**
 * @author dxc
 * @date 2020/5/28 18:27
 */

@Data
public class Message {
    private Integer id;
    private Date createAt;
    private Integer sender;
    private Integer receiver;
    private String content;
    private Integer status;
}
