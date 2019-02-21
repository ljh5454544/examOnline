package com.exam.test.pojo;

public class Major {
    private Integer mId;

    private String mName;

    private Integer gradeId;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public String toString() {
        return "Major{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", gradeId=" + gradeId +
                '}';
    }
}