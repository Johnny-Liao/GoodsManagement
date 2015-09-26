package org.goodsManagement.vo;

/**
 * Created by lifei on 2015/9/25.
 */
public class InrepositoryShow {
//    select inrepositoryid,suppliers,operatorid,linkman
//    from inrepository group by inrepositoryid;
    private String inrepositoryid;
    private String suppliers;
    private String linkman;
    private String phone;
    private String staffname;
    private String intime;

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getInrepositoryid() {
        return inrepositoryid;
    }

    public void setInrepositoryid(String inrepositoryid) {
        this.inrepositoryid = inrepositoryid;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }
}
