package org.goodsmanagement.dao.impl;

import org.goodsManagement.dao.impl.DeliveryDetailDaoImpl;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.vo.GetGoodsVO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by johnny on 2015/9/23.
 */
public class DeliveryDetailDaoImplTest {

    private ApplicationContext applicationContext;
    private DeliveryDetailDaoImpl getGoodsDao;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        getGoodsDao = (DeliveryDetailDaoImpl) applicationContext.getBean("getGoodsDaoImpl");
    }

    @Test
    public void getGoodsById() {
        GetGoodsVO vo = getGoodsDao.getGoodsById(1);
        System.out.println(vo);
    }

    @Test
    public void allGetGoodsInfo() {
        List<GetGoodsVO> list = getGoodsDao.allGetGoodsInfo();
        System.out.println(list);
    }


    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        GetGoodsDto getGoodsDto = new GetGoodsDto();
        getGoodsDto.setGoodid(1);
        getGoodsDto.setStaffid(1);
        getGoodsDto.setGetnumber(20);
        getGoodsDao.insert(getGoodsDto);
    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        getGoodsDao.selectByPrimaryKey(1);
    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}