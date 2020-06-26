package com.gmall.user.mapper;

import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户信息
     * @return
     */
    List<UmsMember> selectAllUser();

    /**
     * 根据用户ID查询用户地址
     * @param memberId
     * @return
     */
    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(String memberId);

}
