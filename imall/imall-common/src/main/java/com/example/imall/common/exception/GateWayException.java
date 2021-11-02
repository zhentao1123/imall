package com.example.imall.common.exception;

import com.example.imall.common.api.IErrorCode;
import lombok.Data;

/**
 * Created by BobZhang on 2021/10/29
 */
@Data
public class GateWayException extends RuntimeException{

    private long code;
    private String message;

    public GateWayException(IErrorCode iErrorCode) {
        this.code = iErrorCode.getCode();
        this.message = iErrorCode.getMessage();
    }
}
