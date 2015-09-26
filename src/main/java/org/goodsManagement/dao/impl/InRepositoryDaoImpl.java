package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.vo.InrepositoryGood;
import org.goodsManagement.vo.InrepositoryShow;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */
@Component
public class InRepositoryDaoImpl extends BasedaoA<InRepositoryDto> {
    private int pagesize=3;

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public InRepositoryDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.InRepositoryDtoMapper.selectByPrimaryKey", id);
    }

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.InRepositoryDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(InRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.InRepositoryDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(InRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.InRepositoryDtoMapper.insertSelective", record);
    }

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(InRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.InRepositoryDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(InRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.InRepositoryDtoMapper.updateByPrimaryKey", record);
    }


    /**
     * 获取入库的表中所有的信息
     *
     * @return
     */
    public List<InrepositoryShow> selectall() {
        return sessionTemplate.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectgroup");
    }
    /**
     * 条件查询
     *
     * @param sql
     *      Inrepositorysql类型的对象，保存需要查询的信息
     * @return
     */
    public List<InrepositoryShow> selectsearch(Inrepositorysql sql) {
        List<InrepositoryShow> list = sessionTemplate.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectsql",sql);
        System.out.println("Dao层中执行了方法"+list.size());
        return sessionTemplate.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectsearchbypage",sql);
    }
    /**
     * 查询入库单下所有入库的物品
     *
     * @return
     */
    public List<InrepositoryGood> selectallingood(String inrepositoryid) {
        return sessionTemplate.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectingood",inrepositoryid);
    }

    /**
     * 查询一张入库单的基本信息
     *
     * @return
     */
    public InrepositoryShow selectmesInprositoryId(String inprositoryId) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.InRepositoryDtoMapper.selectmesInprositoryId", inprositoryId);
    }

    /**
     * 分页查询
     *
     * @return
     */
    public List<InrepositoryShow> selectbypage(int page) {
        System.out.println(page+"=========");
        return sessionTemplate.selectList("org.goodsManagement.mapper.InRepositoryDtoMapper.selectbypage", page * pagesize);
    }

    /**
     * 统计有多少条入库单记录
     *
     * @return
     */
    public int selectcount() {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.InRepositoryDtoMapper.selectcountpage");
    }

    /**
     * 通过条件查询统计有多少条入库单记录
     *
     * @return
     */
    public int selectcountsearch(Inrepositorysql sql) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.InRepositoryDtoMapper.selectcountsearch",sql);
    }
}
