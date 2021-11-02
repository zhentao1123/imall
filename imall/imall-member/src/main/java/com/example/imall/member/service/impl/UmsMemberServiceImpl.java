package com.example.imall.member.service.impl;

import com.example.imall.common.api.CommonResult;
import com.example.imall.common.api.TokenInfo;
import com.example.imall.member.service.UmsMemberService;
import com.example.imall.model.UmsMember;
import org.springframework.stereotype.Service;

/**
 * Created by BobZhang on 2021/11/2
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Override
    public UmsMember getByUsername(String username) {
        return UmsMember.builder().username(username).build();
    }

    @Override
    public UmsMember getById(Long id) {
        return UmsMember.builder().id(id).build();
    }

    @Override
    public CommonResult register(String username, String password, String telephone, String authCode) {
        return CommonResult.success(null);
    }

    @Override
    public CommonResult generateAuthCode(String telephone) {
        return CommonResult.success(null);
    }

    @Override
    public CommonResult updatePassword(String telephone, String password, String authCode) {
        return CommonResult.success(null);
    }

    @Override
    public UmsMember getCurrentMember() {
        return null;
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {

    }

    @Override
    public TokenInfo login(String username, String password) {
        return null;
    }

    @Override
    public String refreshToken(String token) {
        return null;
    }

    @Override
    public int updateUmsMember(UmsMember umsMember) {
        return 0;
    }
}
