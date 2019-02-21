package com.exam.test.pojo;

import java.util.Date;

public class Testpaper {
    private Integer tpId;

    private String tpName;

    private Date tpCreatetime;

    private Date tpStarttime;

    private Date tpEndtime;

    private String tpClassname;

    private Integer tpStatus;

    private Integer teacherId;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName == null ? null : tpName.trim();
    }

    public Date getTpCreatetime() {
        return tpCreatetime;
    }

    public void setTpCreatetime(Date tpCreatetime) {
        this.tpCreatetime = tpCreatetime;
    }

    public Date getTpStarttime() {
        return tpStarttime;
    }

    public void setTpStarttime(Date tpStarttime) {
        this.tpStarttime = tpStarttime;
    }

    public Date getTpEndtime() {
        return tpEndtime;
    }

    public void setTpEndtime(Date tpEndtime) {
        this.tpEndtime = tpEndtime;
    }

    public String getTpClassname() {
        return tpClassname;
    }

    public void setTpClassname(String tpClassname) {
        this.tpClassname = tpClassname == null ? null : tpClassname.trim();
    }

    public Integer getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(Integer tpStatus) {
        this.tpStatus = tpStatus;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Testpaper{" +
                "tpId=" + tpId +
                ", tpName='" + tpName + '\'' +
                ", tpCreatetime=" + tpCreatetime +
                ", tpStarttime=" + tpStarttime +
                ", tpEndtime=" + tpEndtime +
                ", tpClassname='" + tpClassname + '\'' +
                ", tpStatus=" + tpStatus +
                ", teacherId=" + teacherId +
                '}';
    }
}