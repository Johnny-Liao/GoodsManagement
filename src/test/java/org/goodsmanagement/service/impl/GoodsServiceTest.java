package org.goodsmanagement.service.impl;

import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.service.impl.GoodsServiceImpl;
import org.goodsManagement.service.impl.OutRepositoryServiceImpl;
import org.goodsManagement.vo.GoodsVo;
import org.goodsManagement.vo.OutGoodsWithSameId;
import org.goodsManagement.vo.OutRepositoryVO;
import org.goodsManagement.vo.Warehouse;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by johnny on 15-9-23.
 */
public class GoodsServiceTest {
    private ApplicationContext applicationContext;
    private GoodsServiceImpl goodsService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        goodsService = (GoodsServiceImpl) applicationContext.getBean("goodsServiceImpl");
    }

    @Test
    public void getWarehouseInventory() {
        List<Warehouse> vo = goodsService.getWarehouseInventory("月饼");
        System.out.println(vo);
    }


    @Test
    public void getEntitiesByname() {
        List<GoodsDto> dto = goodsService.getEntitiesByname("月饼");
        System.out.println(dto);
    }

    @Test
    public void testDeleteByPrimaryKey() throws Exception {

    }

}
