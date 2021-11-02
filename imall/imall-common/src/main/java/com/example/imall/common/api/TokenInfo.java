package com.example.imall.common.api;

import lombok.Data;

import java.util.Map;

/**
 * Created by BobZhang on 2021/10/29
 */
@Data
public class TokenInfo {
    private String access_token;

    private String token_type;

    private String refresh_token;

    private String scope;

    private Map<String,String> additionalInfo;
}
