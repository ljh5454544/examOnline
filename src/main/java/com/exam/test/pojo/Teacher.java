package com.exam.test.pojo;

public class Teacher {
    private Integer tId;

    private String tUsername;

    private String tName;

    private String tPassword;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername == null ? null : tUsername.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tUsername='" + tUsername + '\'' +
                ", tName='" + tName + '\'' +
                ", tPassword='" + tPassword + '\'' +
                '}';
    }
}