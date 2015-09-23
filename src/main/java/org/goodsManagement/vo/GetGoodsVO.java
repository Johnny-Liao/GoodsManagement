package org.goodsManagement.vo;

/**
 * 所有需要显示的信息的封装类
 * Created by johnny on 15-9-23.
 */
public class GetGoodsVO {
    private int id;
    private String staffname;
    private String goodname;
    private String goodtype;
    private int getnumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(String goodtype) {
        this.goodtype = goodtype;
    }

    public int getGetnumber() {
        return getnumber;
    }

    public void setGetnumber(int getnumber) {
        this.getnumber = getnumber;
    }

    @Override
    public String toString() {
        return "GetGoodsVO{" +
                "id=" + id +
                ", staffname='" + staffname + '\'' +
                ", goodname='" + goodname + '\'' +
                ", goodtype='" + goodtype + '\'' +
                ", getnumber=" + getnumber +
                '}';
    }
}
