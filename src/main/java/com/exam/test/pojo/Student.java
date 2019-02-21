package com.exam.test.pojo;

public class Student {
    private Integer sId;

    private String sUsername;

    private String sName;

    private String sPassword;

    private Integer classId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername == null ? null : sUsername.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword == null ? null : sPassword.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sUsername='" + sUsername + '\'' +
                ", sName='" + sName + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", classId=" + classId +
                '}';
    }
}