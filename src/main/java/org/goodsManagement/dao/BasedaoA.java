package org.goodsManagement.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 本类是DAO工具类，定义了dao基本的操作接口，并且支持进行复杂的hql查询
 * 支持分页查询
 * 之所以将很多本来可以在这里实现的CRUD操作交给子类重新实现是因为子类很有可能在CRUD之前进行检查工作
 * 每个实体类的检查时各不相同的，所以还是讲方法设计为抽象类
 * Created by never on 2015/8/25.
 */
public abstract class BasedaoA<T> {

    @Autowired
    protected SqlSessionTemplate sessionTemplate;

    /**
     * 添加实体
     *
     * @param t 实体对象
     */
    public abstract void addEntity(T t);

    /**
     * 修改实体
     *
     * @param t 实体对象
     */
    public abstract void modifyEntity(T t);

    /**
     * load具有懒加载效果，获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    public abstract T loadEntity(int id);

    /**
     * 获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    public abstract T getEntity(int id);

    /**
     * 获得所有的实体类
     *
     * @return
     */
    public abstract List<T> getAllEntities();


    /**
     * 删除指定的某个实体
     *
     * @param t 实体对象
     * @return
     */
    public abstract void deleteEntity(T t);

    /**
     * 使用hql语言进行查询操作
     *
     * @param hql hql语句
     * @return
     */
//    public List<?> find(String hql) {
//        Query q = sessionTemplate.getSqlSessionFactory().openSession()..getSessionFactory().getCurrentSession().createQuery(hql);
//        return q.list();
//    }

    /**
     * 提供Map对应的传参hql查询
     * <p>
     * from table t where t.id =:id and t.name=:name
     * map中应该这样添加
     * map.put("id",Id);
     * map.put("name",Name);
     *
     * @param hql    hql语句
     * @param params 参数集
     * @return hql语句的结果集
     */
//    public List<?> find(String hql, Map<String, Object> params) {
//        Query q = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
//        if (params != null && !params.isEmpty()) {
//            for (String key : params.keySet()) {
//                q.setParameter(key, params.get(key));
//            }
//        }
//        return q.list();
//    }

    /**
     * 支持分页查询提供Map对应的传参hql查询
     * <p>
     * from table t where t.id =:id and t.name=:name
     * map中应该这样添加
     * map.put("id",Id);
     * map.put("name",Name);
     *
     * @param hql    hql语句
     * @param params 参数集
     * @param page   分页中页数
     * @param rows   每页中的行数
     * @return hql语句的结果集
     */
//    public List<?> find(String hql, Map<String, Object> params, int page, int rows) {
//        Query q = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
//        if (params != null && !params.isEmpty()) {
//            for (String key : params.keySet()) {
//                q.setParameter(key, params.get(key));
//            }
//        }
//        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//    }

    /**
     * 支持分页查询hql查询
     * <p>
     * from table t where t.id =:id and t.name=:name
     *
     * @param hql  hql语句
     * @param page 分页中页数
     * @param rows 每页中的行数
     * @return hql语句的结果集
     */
//    public List<?> find(String hql, int page, int rows) {
//        Query q = hibernateTemplate.getSessionFactory().getCurrentSession().createQuery(hql);
//        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//    }
}
