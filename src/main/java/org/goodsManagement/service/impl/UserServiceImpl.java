package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.UserDaoImpl;
import org.goodsManagement.po.UserDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * Created by Johnny on 2015/9/29.
 */
@Service
public class UserServiceImpl implements BaseServiceI<UserDto> {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDaoImpl userDaoImpl;

    public UserDto existUser(UserDto userDto) {
       return userDaoImpl.existUser(userDto);
    }

    public void addEntity(UserDto userDto) {

    }

    public void modifyEntity(UserDto userDto) {

    }

    public UserDto loadEntity(int id) {
        return null;
    }

    public UserDto getEntity(int id) {
        return null;
    }

    public void deleteEntity(UserDto userDto) {

    }
}
