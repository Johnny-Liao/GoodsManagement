package org.goodsmanagement.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.goodsManagement.dao.impl.DeptdaoImpl;
import org.goodsManagement.po.DeptDto;
import org.goodsManagement.po.GoodsDto;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */
public class GoodsMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        //测试通过名字查询到货品
        List<GoodsDto> users =  sqlSession.selectList("org.goodsManagement.mapper.GoodsDtoMapper.selectByName", "衬衫");
        System.out.println(users.size());
    }

}
