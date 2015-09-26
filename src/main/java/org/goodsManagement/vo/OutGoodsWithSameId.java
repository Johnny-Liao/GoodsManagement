package org.goodsManagement.vo;

/**
 * Created by johnny on 15-9-26.
 */
public class OutGoodsWithSameId {
    private String goodname;
    private String deptname;
    private int goodnumber;
    private String goodunit;
    private String goodtype;

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getGoodnumber() {
        return goodnumber;
    }

    public void setGoodnumber(int goodnumber) {
        this.goodnumber = goodnumber;
    }

    public String getGoodunit() {
        return goodunit;
    }

    public void setGoodunit(String goodunit) {
        this.goodunit = goodunit;
    }

    public String getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(String goodtype) {
        this.goodtype = goodtype;
    }

    @Override
    public String toString() {
        return "OutGoodsWithSameId{" +
                "goodname='" + goodname + '\'' +
                ", deptname='" + deptname + '\'' +
                ", goodnumber=" + goodnumber +
                ", goodunit='" + goodunit + '\'' +
                ", goodtype='" + goodtype + '\'' +
                '}';
    }
}
