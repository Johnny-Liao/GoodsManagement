package org.goodsmanagement.dao.impl;

import org.goodsManagement.dao.impl.GoodsDaoImpl;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.vo.GetGoodsVO;
import org.goodsManagement.vo.Warehouse;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by johnny on 2015/9/23.
 */
public class GoodsDaoImplTest {

    private ApplicationContext applicationContext;
    private GoodsDaoImpl goodsDao;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        goodsDao = (GoodsDaoImpl) applicationContext.getBean("goodsDaoImpl");
    }

    @Test
    public void getWarehouseInventoryTest() {
        List<Warehouse> warehouses = goodsDao.getWarehouseInventory();
        System.out.println(warehouses);
    }

    @Test
    public void getGoodsById() {

    }

    @Test
    public void allGetGoodsInfo() {
    }


    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
    }

    @Test
    public void testInsertSelective() throws Exception {

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