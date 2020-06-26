package com.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;
import com.gmall.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping(value = "/getReceiveAddress/{id}",method = RequestMethod.GET)
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@PathVariable("id") String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

}
