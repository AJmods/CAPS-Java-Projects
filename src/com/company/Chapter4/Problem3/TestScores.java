package com.company.Chapter4.Problem3;

public class TestScores {

    double score1=0;
    double score2=0;
    double score3=0;

    public TestScores(double score1, double score2, double score3)
    {
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }
    public char getLetterGrade()
    {
        if (getAverage()>=90) return 'A';
        else if (getAverage()>=80) return 'B';
        else if (getAverage()>=70) return 'C';
        else if (getAverage()>=60) return 'D';
        else return 'F';
    }
    public double getAverage()
    {
        return (score1+score2+score3)/3;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }
}
