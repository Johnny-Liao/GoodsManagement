package org.goodsmanagement.service.impl;

import org.goodsManagement.po.OutRepositoryDto;
import org.goodsManagement.service.impl.GetGoodsServiceImpl;
import org.goodsManagement.service.impl.OutRepositoryServiceImpl;
import org.goodsManagement.vo.GetGoodsVO;
import org.goodsManagement.vo.OutGoodsWithSameId;
import org.goodsManagement.vo.OutRepositoryVO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by johnny on 15-9-23.
 */
public class OutRepositoryServiceTest {
    private ApplicationContext applicationContext;
    private OutRepositoryServiceImpl outRepositoryService;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("application-config.xml");
        outRepositoryService = (OutRepositoryServiceImpl) applicationContext.getBean("outRepositoryServiceImpl");
    }

    @Test
    public void getOutReposById() {
        OutRepositoryVO vo = outRepositoryService.getOutReposById("YIFU");
        System.out.println(vo);
    }

    @Test
    public void getAllInfo() {
        List<OutRepositoryVO> vo = outRepositoryService.getAllOutRepositoryVO();
        System.out.println(vo);
    }

    @Test
    public void getDifferentGoodsById() {
        List<OutGoodsWithSameId> goods = outRepositoryService.getDifferentGoodsById("KUZI");
        for (OutGoodsWithSameId good : goods) {
            System.out.println(good);
        }
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
