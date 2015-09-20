package org.goodsmanagement.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.goodsManagement.po.DeptDto;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

/**
 * Created by never on 2015/9/20.
 */
public class DeptDtoMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
//        String resource = "sqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        DeptDto deptDto = new DeptDto();
        deptDto.setDeptname("测试");
        int i = sqlSession.insert("org.goodsManagement.mapper.DeptDtoMapper.insert", deptDto);
        System.out.println(deptDto);
    }

    @Test
    public void testInsertSelective() throws Exception {
//        SqlSessionFactory sf;
//        String resource = "sqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        sf= new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sf.openSession();
//        DeptDto u;
//        u = session.selectOne("org.goodsManagement.mapper.DeptDtoMapper.selectByPrimaryKey", "1");
//        System.out.println(u);
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}