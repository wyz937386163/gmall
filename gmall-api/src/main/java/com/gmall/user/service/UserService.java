package com.gmall.user.service;


import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    List<UmsMember> getAllUser();

    /**
     * 根据用户ID查询用户地址
     * @param memberId
     * @return
     */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
