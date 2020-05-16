package com.wjs.piao.service.impl;


import com.wjs.piao.core.AbstractService;
import com.wjs.piao.dao.UserMapper;
import com.wjs.piao.model.User;
import com.wjs.piao.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/05/14.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
