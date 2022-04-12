package com.common.util;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code = 0;

    private String message = "";

    private T  date;

    public Result (){

    }


    public Result (Integer code ,String message){
       this.code = code;
       this.message = message;
    }

    public Result (Integer code ,String message,T date){
        this.code = code;
        this.message = message;
        this.date = date;
    }

    public static Result<Object> ok(){
        Result<Object> result = new Result<>();
        result.setCode(200);
        return result;
    }
    public static Result<Object> ok(Object date){
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setDate(date);
        return result;
    }


    public static Result<Object> ok(String message,Object date){
        Result<Object> result = new Result<>();
        result.setCode(200);
        result.setMessage(message);
        result.setDate(date);
        return result;
    }


}
