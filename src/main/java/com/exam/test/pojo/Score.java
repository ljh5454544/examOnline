package com.exam.test.pojo;

public class Score {
    private Integer sId;

    private Integer sScore;

    private Integer testpaperId;

    private Integer studentId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsScore() {
        return sScore;
    }

    public void setsScore(Integer sScore) {
        this.sScore = sScore;
    }

    public Integer getTestpaperId() {
        return testpaperId;
    }

    public void setTestpaperId(Integer testpaperId) {
        this.testpaperId = testpaperId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sId=" + sId +
                ", sScore=" + sScore +
                ", testpaperId=" + testpaperId +
                ", studentId=" + studentId +
                '}';
    }
}