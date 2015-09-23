package org.goodsmanagement.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.goodsManagement.dao.impl.InRepositoryDaoImpl;
import org.goodsManagement.vo.InrepositoryGood;
import org.goodsManagement.vo.Inrepositorysql;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by lifei on 2015/9/23.
 */
public class InrepositoryMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private ApplicationContext applicationContext;
    @Autowired
    @Qualifier("inRepositoryDaoImpl")
    private static InRepositoryDaoImpl inRepositoryDaoImpl;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        inRepositoryDaoImpl = (InRepositoryDaoImpl) applicationContext.getBean("inRepositoryDaoImpl");
        sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        //测试条件查询
        Inrepositorysql sql = new Inrepositorysql();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-DD");
        sql.setIntime("2015-09-22");
//        sql.setSuppliers("傻逼");
//        sql.setInrepositoryid("ad1231");
        List<InrepositoryGood> list= sqlSession.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectsql",sql);
        System.out.println(list.size());
    }

}
