package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.StaffDaoImpl;
import org.goodsManagement.po.StaffDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */
@Service
public class StaffServiceImpl implements BaseServiceI<StaffDto> {
    @Autowired
    @Qualifier("staffDaoImpl")
    private StaffDaoImpl staffDaoImpl;
    /**
     * 添加实体
     *
     * @param staffDto 实体对象
     */
    public void addEntity(StaffDto staffDto) {
        staffDaoImpl.insert(staffDto);
    }
    /**
     * 修改实体
     *
     * @param goodsDto 实体对象(不需指定所有的键)
     */
    public void modifyEntity(StaffDto staffDto) {
        staffDaoImpl.updateByPrimaryKey(staffDto);
    }
    /**
     * 通过ID获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    public StaffDto getEntity(int id) {
        return staffDaoImpl.selectByPrimaryKey(id);
    }
    /**
     * 获取多有的实体类
     *
     * @return  所有员工的集合
     *
     */
    public List<StaffDto> getAllEntities() {
        return staffDaoImpl.selectAll();
    }
    /**
     * 删除指定ID的商品
     *
     */
    public void deleteEntity(int id) {
        staffDaoImpl.deleteByPrimaryKey(id);
    }
    public void deleteEntity(StaffDto staffDto) {

    }
    public StaffDto loadEntity(int id) {
        return null;
    }
}
