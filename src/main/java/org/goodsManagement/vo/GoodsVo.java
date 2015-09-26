package org.goodsManagement.vo;

/**
 * Created by Jimmyhjy on 2015/9/26.
 */
public class GoodsVo {
    private String goodname;
    private String goodunit;
    private int goodnumbers;
    private String goodtype;

    public int getGoodnumbers() {
        return goodnumbers;
    }

    public void setGoodnumbers(int goodnumbers) {
        this.goodnumbers = goodnumbers;
    }

    public String getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(String goodtype) {
        this.goodtype = goodtype;
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
}
