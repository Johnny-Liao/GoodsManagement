package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.InRepositoryDaoImpl;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.service.impl.PoiUtils.InRepositoryUtils;
import org.goodsManagement.vo.InrepositoryGood;
import org.goodsManagement.vo.InrepositoryShow;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InRepositoryServiceImpl implements BaseServiceI<InRepositoryDto> {

    @Autowired
    @Qualifier("inRepositoryDaoImpl")
    private InRepositoryDaoImpl inRepositoryDaoImpl;

    @Autowired
    @Qualifier("inRepositoryUtils")
    private InRepositoryUtils inRepositoryUtils;

    private int pagecount;

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public void addEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.insert(inRepositoryDto);
    }

    public void modifyEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.updateByPrimaryKey(inRepositoryDto);
    }

    public InRepositoryDto loadEntity(int id) {
        return null;
    }

    public InRepositoryDto getEntity(int id) {
        return inRepositoryDaoImpl.selectByPrimaryKey(id);
    }

    public List<InRepositoryDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.deleteByPrimaryKey(inRepositoryDto.getId());
    }

    /**
     * 产品入库
     */
    public void addinRepositoryD(String filename) {
        inRepositoryUtils.addPoiUtils(filename);
    }

    /**
     * 查看所有的入库信息
     */
    public List<InrepositoryShow> selectallmes() {
        return inRepositoryDaoImpl.selectall();
    }

    /**
     * 条件查询
     */
    public List<InrepositoryShow> selectbysearch(Inrepositorysql sql) {
        System.out.println(sql.getIntime());
        return inRepositoryDaoImpl.selectsearch(sql);
    }
    /**
     * 按照入库单号查询所有入库的货物，入库数量，以及详细的入库单信息，在另一个jsp页面显示时调用
     */
    public List<InrepositoryGood> selectallingood(String inrepositoryid){
        return  inRepositoryDaoImpl.selectallingood(inrepositoryid);
    }

    /**
     * 查询一张入库单的基本信息
     *
     * @return
     */
    public InrepositoryShow selectmesInprositoryId(String inprositoryId) {
        return  inRepositoryDaoImpl.selectmesInprositoryId(inprositoryId);
    }


    /**
     * 统计有多少页
     *
     * @return
     */
    public int selectcountpage() {
        int pagesize = 3;
        int count = inRepositoryDaoImpl.selectcount();
        if(count%pagesize!=0){

            pagecount = (count/pagesize)+1;
        }else{
            pagecount = count/pagesize;
        }
        return pagecount;
    }

    /**
     * 根据页码查询记录
     *
     * @return
     */
    public List<InrepositoryShow> selectbypage(int page) {
        return  inRepositoryDaoImpl.selectbypage(page);
    }


    /**
     * 通过条件查询统计有多少条入库单记录
     *
     * @return
     */
    public int selectcountsearch(Inrepositorysql sql) {
        return inRepositoryDaoImpl.selectcountsearch(sql);
    }


    /**
     * 统计条件查询有多少页
     *
     * @return
     */
    public int selectcountsearchpage(Inrepositorysql sql) {
        int pagesize = 3;
        int count = inRepositoryDaoImpl.selectcountsearch(sql);
        if(count%pagesize!=0){

            pagecount = (count/pagesize)+1;
        }else{
            pagecount = count/pagesize;
        }
        return pagecount;
    }

}
