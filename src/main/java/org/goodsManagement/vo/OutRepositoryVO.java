package org.goodsManagement.vo;

/**
 * Created by johnny on 15-9-26.
 */
public class OutRepositoryVO {
    // outrepositoryid, outr.id, outtime, goodname, goodtype, goodnumber, username, deptname, comments
    private String outrepositoryid;
    private int id;
    private String outtime;
    private String goodname;
    private String goodtype;
    private int goodnumber;
    private String username;
    private String deptname;
    private String comments;

    public String getOutrepositoryid() {
        return outrepositoryid;
    }

    public void setOutrepositoryid(String outrepositoryid) {
        this.outrepositoryid = outrepositoryid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
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

    public int getGoodnumber() {
        return goodnumber;
    }

    public void setGoodnumber(int goodnumber) {
        this.goodnumber = goodnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "OutRepositoryVO{" +
                "outrepositoryid='" + outrepositoryid + '\'' +
                ", id=" + id +
                ", outtime='" + outtime + '\'' +
                ", goodname='" + goodname + '\'' +
                ", goodtype='" + goodtype + '\'' +
                ", goodnumber=" + goodnumber +
                ", username='" + username + '\'' +
                ", deptname='" + deptname + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
