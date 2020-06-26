package com.gmall.user.service.impl;

import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;
import com.gmall.user.mapper.UserMapper;
import com.gmall.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userMapper.selectReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
