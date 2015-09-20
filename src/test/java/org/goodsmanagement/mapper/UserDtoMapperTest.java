package org.goodsmanagement.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.goodsManagement.po.UserDto;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import java.io.InputStream;

/**
 * Created by never on 2015/9/20.
 */
public class UserDtoMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
//        sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setId(10);
        userDto.setUsername("test");
        userDto.setPassword("test");
        sqlSession.selectOne("org.goodsManagement.mapper.UserDtoMapper.insert", userDto);
        sqlSession.commit();
        sqlSession.close();
//        System.out.println(userDto);
    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        UserDto userDto = sqlSession.selectOne("org.goodsManagement.mapper.UserDtoMapper.selectByPrimaryKey", 1);
        System.out.println(userDto);
    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}