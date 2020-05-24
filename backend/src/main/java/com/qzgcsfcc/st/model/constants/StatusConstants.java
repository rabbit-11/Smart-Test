package com.qzgcsfcc.st.model.constants;

/**
 * @author hanbing
 */
public enum StatusConstants {

    // 泛指操作成功
    SUCCESS(200, "操作成功"),
    // 泛指操作成功
    LOGIN_FAIL(201, "没有登录"),
    // 登录超时 timeoutJson.jsp中使用
    TIME_OUT(203, "登录超时"),
    // 未授权 unauthJson.jsp中使用
    UNAUTH(204, "未授权"),
    // 泛指操作失败
    FAILED(601, "操作失败"),

    PARAMETER_LACK(401, "缺少参数"),
    PARAMETER_MISMATCHING(402, "参数格式不匹配"),

    EXIST(501, "已存在"),
    NO_EXIST(502, "不存在"),
    WX_FAIL(503, "微信调用异常"),
    BAD_SQL(504, "数据库操作异常，请联系管理员"),
    DUPLICATE_ITEM(505,"重复对象"),
    NEED_ENTER_CODE(506,"请输入正确的邀请码"),
    WRONG_INPUT(507,"输入有误");

    private final Integer status;

    private final String msg;

    /**
     * @param status status
     * @param msg    msg
     */
    StatusConstants(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }


    /**
     * 用于switch中,将String转化为枚举类
     */
    public static StatusConstants getByType(Integer status) {
        for (StatusConstants statusConstants : values()) {
            if (statusConstants.getStatus().equals(status)) {
                return statusConstants;
            }
        }
        return null;
    }

}