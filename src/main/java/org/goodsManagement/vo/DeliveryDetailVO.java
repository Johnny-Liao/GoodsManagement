package org.goodsManagement.vo;

/**
 * Created by never on 2015/9/28.
 */
public class DeliveryDetailVO {

    private String deptname;
    private int id;
    private String staffname;
    private String sex;
    private int getnumber;
    private String goodtype;
    private String goodname;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGetnumber() {
        return getnumber;
    }

    public void setGetnumber(int getnumber) {
        this.getnumber = getnumber;
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

    @Override
    public String toString() {
        return "DeliveryDetailVO{" +
                "deptname='" + deptname + '\'' +
                ", id=" + id +
                ", staffname='" + staffname + '\'' +
                ", sex='" + sex + '\'' +
                ", getnumber=" + getnumber +
                ", goodtype='" + goodtype + '\'' +
                ", goodname='" + goodname + '\'' +
                '}';
    }


    //    private GetGoodsDto getGoodsDto;
//    private StaffDto staffDto;
//    private DeptDto deptDto;
//    private GoodsDto goodsDto;
//
//    public GetGoodsDto getGetGoodsDto() {
//        return getGoodsDto;
//    }
//
//    public void setGetGoodsDto(GetGoodsDto getGoodsDto) {
//        this.getGoodsDto = getGoodsDto;
//    }
//
//    public StaffDto getStaffDto() {
//        return staffDto;
//    }
//
//    public void setStaffDto(StaffDto staffDto) {
//        this.staffDto = staffDto;
//    }
//
//    public DeptDto getDeptDto() {
//        return deptDto;
//    }
//
//    public void setDeptDto(DeptDto deptDto) {
//        this.deptDto = deptDto;
//    }
//
//    public GoodsDto getGoodsDto() {
//        return goodsDto;
//    }
//
//    public void setGoodsDto(GoodsDto goodsDto) {
//        this.goodsDto = goodsDto;
//    }
}
