package com.stanley.springboot_me.exception;

import com.stanley.springboot_me.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 這個類裡面的方法都是Controller的全局異常處理(統一處理)
public class GlobalExceptionHandlerAdvice {

    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler({Exception.class})
    public ResponseMessage handlerException(Exception e, HttpServletRequest request){
        // 記錄異常信息
        log.error("統一異常：", e);
        return new ResponseMessage(500, "error", null);
    }
}
