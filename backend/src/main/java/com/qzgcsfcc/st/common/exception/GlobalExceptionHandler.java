package com.qzgcsfcc.st.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger("GlobalExceptionHandler");

    /**
     * 对不同错误进行不同处理
     */
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception ex, Model model, HttpServletRequest request, HttpServletResponse response) {
        String url = "error/500.html", msg = "喔唷，系统出了一个小故障", error = ex.getMessage();
        int code = 500;
        if (ex instanceof IException) {
            msg = ex.getMessage();
            code = ((IException) ex).getCode();
        }  else {
            logger.error(ex.getMessage(), ex);
        }
        if (isAjax(request)) {
            printJSON(code, msg, error, response);
            return null;
        }
        model.addAttribute("code", code);
        model.addAttribute("msg", msg);
        model.addAttribute("error", error);
        return url;
    }

    /**
     * 判断是不是ajax请求
     */
    private boolean isAjax(HttpServletRequest request) {
        String xHeader = request.getHeader("X-Requested-With");
        return (xHeader != null && xHeader.contains("XMLHttpRequest"));
    }

    /**
     * 输出json内容
     */
    private void printJSON(int code, String msg, String error, HttpServletResponse response) {
        response.setContentType("application/json;charset=utf-8");
        try {
            PrintWriter out = response.getWriter();
            out.write("{\"code\": " + code + ", \"msg\": \"" + msg + "\", \"error\": \"" + error + "\"}");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
