package org.goodsManagement.mapper;

import org.goodsManagement.po.OutRepositoryDto;

public interface OutRepositoryDtoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    int insert(OutRepositoryDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    int insertSelective(OutRepositoryDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    OutRepositoryDto selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    int updateByPrimaryKeySelective(OutRepositoryDto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outrepository
     *
     * @mbggenerated Sun Sep 20 09:05:17 CST 2015
     */
    int updateByPrimaryKey(OutRepositoryDto record);
}