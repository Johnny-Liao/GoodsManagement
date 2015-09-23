package org.goodsManagement.vo;

/**
 * 库房盘存显示VO
 * Created by johnny on 15-9-23.
 */
public class Warehouse {
    private int id;
    private String goodName;
    private int sumNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getSumNum() {
        return sumNum;
    }

    public void setSumNum(int sumNum) {
        this.sumNum = sumNum;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", sumNum=" + sumNum +
                '}';
    }
}
