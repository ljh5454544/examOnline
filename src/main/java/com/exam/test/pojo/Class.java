package com.exam.test.pojo;

public class Class {
    private Integer cId;

    private String cName;

    private Integer majorId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", majorId=" + majorId +
                '}';
    }
}