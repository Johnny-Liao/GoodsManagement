package org.goodsmanagement.service.impl;

import org.goodsManagement.po.UserDto;
import org.goodsManagement.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by johnny on 15-9-23.
 */
public class UserServiceTest {
    private ApplicationContext applicationContext;
    private UserServiceImpl userServiceImpl;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
    }

    @Test
    public void testExistUser() {
        UserDto userDto = new UserDto();
        userDto.setUsername("admin");
        userDto.setPassword("admin");
        UserDto result = userServiceImpl.existUser(userDto);
        System.out.println(result);
    }

    @Test
    public void testChangePassword() {
        UserDto userDto = new UserDto();
        userDto.setUsername("admin");
        userDto.setPassword("admin");
        userServiceImpl.changePassword(userDto);
        System.out.println("done");
    }
}
