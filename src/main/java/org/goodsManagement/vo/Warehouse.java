package org.goodsManagement.vo;

/**
 * 库房盘存显示VO
 * Created by johnny on 15-9-23.
 */
public class Warehouse {
    private int id;
    private String goodname;
    private int sumnum;
    private String goodunit;

    public int getSumnum() {
        return sumnum;
    }

    public void setSumnum(int sumnum) {
        this.sumnum = sumnum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }



    public String getGoodunit() {
        return goodunit;
    }

    public void setGoodunit(String goodunit) {
        this.goodunit = goodunit;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "goodUnit=" + goodunit +
                ", goodName='" + goodname + '\'' +
                ", sum=" + sumnum +
                '}';
    }
}
