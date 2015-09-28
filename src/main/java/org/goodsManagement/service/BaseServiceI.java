package org.goodsManagement.service;

import java.util.List;

/**
 * Created by never on 2015/8/25.
 */
public interface BaseServiceI<T> {
    /**
     * 添加实体
     *
     * @param t 实体对象
     */
    void addEntity(T t);

    /**
     * 修改实体
     *
     * @param t 实体对象
     */
    void modifyEntity(T t);

    /**
     * load具有懒加载效果，获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    T loadEntity(int id);

    /**
     * 获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    T getEntity(int id);

    /**
     * 获得所有的实体类
     *
     * @return
     */
//    List<T> getAllEntities();


    /**
     * 删除指定的某个实体
     *
     * @param t 实体对象
     * @return
     */
    void deleteEntity(T t);

}
