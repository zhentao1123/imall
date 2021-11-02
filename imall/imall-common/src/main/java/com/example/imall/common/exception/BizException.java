package com.example.imall.common.exception;

/**
 * Created by BobZhang on 2021/10/29
 */
public class BizException extends Exception{
    public BizException(){
        super();
    }
    public BizException(String message){
        super(message);
    }
}
