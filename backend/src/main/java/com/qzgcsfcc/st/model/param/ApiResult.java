package com.qzgcsfcc.st.model.param;

import com.qzgcsfcc.st.model.constants.StatusConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回格式
 *
 * @author hanbing
 * @date 2019年7月19日
 * copyright @ HeleTech 2016
 */
@Data
public class ApiResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;


    private Object data;

    public ApiResult() {
        success();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void fail(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public void fail(Integer status) {
        fail(status, "操作失败");
    }

    public void fail(String msg) {
        fail(404, msg);
    }

    public void fail(StatusConstants statusConstants) {
        this.status = statusConstants.getStatus();
        this.msg = statusConstants.getMsg();
    }

    public void fail(StatusConstants statusConstants, String msg) {
        this.status = statusConstants.getStatus();
        this.msg = msg;
    }

    public void fail() {
        fail(404);
    }

    public void success(Object data) {
        success(200);
        this.data = data;
    }

    public void success(Integer status) {
        this.status = status;
//        this.code = status;
        this.msg = "操作成功";
        this.data = new HashMap<>(1);
    }

    public void success() {
        success(200);
    }


    public void lackParams(String msg) {
        fail(401, msg);
    }

    @Override
    public String toString() {
        return "status: " + status + " msg " + msg;
    }

    @SuppressWarnings("unchecked")
    public Object get(String key) {
        if (data == null) {
            return null;
        }

        if (data instanceof Map) {
            return ((Map<String, Object>) data).get(key);
        } else {
            return null;
        }
    }

    public boolean IsSuccess() {
        return this.status == 200;

    }

    public boolean IsFail() {
        return this.status != 200;
    }


}
