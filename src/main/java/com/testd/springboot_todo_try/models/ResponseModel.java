package com.testd.springboot_todo_try.models;

public class ResponseModel<T> {
    final private int code;
    final private String message;
    final private T data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public ResponseModel(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
