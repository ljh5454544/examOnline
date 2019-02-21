package com.exam.test.pojo;

public class Grade {
    private Integer gId;

    private String gName;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gId=" + gId +
                ", gName='" + gName + '\'' +
                '}';
    }
}