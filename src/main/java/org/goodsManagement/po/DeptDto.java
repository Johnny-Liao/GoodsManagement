package org.goodsManagement.po;

public class DeptDto {
    /**
     * This field corresponds to the database column dept.id
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    private Integer id;

    /**
     * This field corresponds to the database column dept.deptname
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    private String deptname;

    /**
     * This method returns the value of the database column dept.id
     *
     * @return the value of dept.id
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column dept.id
     *
     * @param id the value for dept.id
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column dept.deptname
     *
     * @return the value of dept.deptname
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method sets the value of the database column dept.deptname
     *
     * @param deptname the value for dept.deptname
     *
     * @mbggenerated Sun Sep 20 14:45:05 CST 2015
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}