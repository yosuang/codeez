package com.yosuang.codeez.component.dto;

/**
 * 单结果返回对象
 *
 * @author yosuang
 * @date 2022/10/30
 */
@SuppressWarnings({"rawtypes"})
public class SingleResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static SingleResponse buildSuccess() {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);
        return response;
    }

    public static SingleResponse buildFailure(String errCode, String errMessage) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

}
