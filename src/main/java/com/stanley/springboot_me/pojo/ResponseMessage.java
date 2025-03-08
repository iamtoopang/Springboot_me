package com.stanley.springboot_me.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
    private int code;
    private String message;
    private T data;

    public ResponseMessage() {
    }

    public ResponseMessage(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 成功回應
     *
     * @param data
     * @return
     */
    public static <T> ResponseMessage<T> success(T data) {
        return new ResponseMessage(HttpStatus.OK.value(), "success", data);
    }

    public static <T> ResponseMessage<T> success() {
        return new ResponseMessage(HttpStatus.OK.value(), "success" , null);
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
