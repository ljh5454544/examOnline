package com.exam.test.pojo;

public class Choose {
    private Integer chId;

    private String chA;

    private String chB;

    private String chC;

    private String chD;

    private String chRight;

    private Integer testpaperId;

    private String chTopic;

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public String getChA() {
        return chA;
    }

    public void setChA(String chA) {
        this.chA = chA == null ? null : chA.trim();
    }

    public String getChB() {
        return chB;
    }

    public void setChB(String chB) {
        this.chB = chB == null ? null : chB.trim();
    }

    public String getChC() {
        return chC;
    }

    public void setChC(String chC) {
        this.chC = chC == null ? null : chC.trim();
    }

    public String getChD() {
        return chD;
    }

    public void setChD(String chD) {
        this.chD = chD == null ? null : chD.trim();
    }

    public String getChRight() {
        return chRight;
    }

    public void setChRight(String chRight) {
        this.chRight = chRight == null ? null : chRight.trim();
    }

    public Integer getTestpaperId() {
        return testpaperId;
    }

    public void setTestpaperId(Integer testpaperId) {
        this.testpaperId = testpaperId;
    }

    public String getChTopic() {
        return chTopic;
    }

    public void setChTopic(String chTopic) {
        this.chTopic = chTopic == null ? null : chTopic.trim();
    }

    @Override
    public String toString() {
        return "Choose{" +
                "chId=" + chId +
                ", chA='" + chA + '\'' +
                ", chB='" + chB + '\'' +
                ", chC='" + chC + '\'' +
                ", chD='" + chD + '\'' +
                ", chRight='" + chRight + '\'' +
                ", testpaperId=" + testpaperId +
                ", chTopic='" + chTopic + '\'' +
                '}';
    }
}