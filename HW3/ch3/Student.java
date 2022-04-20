package com.netcracker.HW3.ch3;

public class Student {
    private String name;
    private int score;
    private int Quiz;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        ++Quiz;
        this.score += score;
    }

    public double getAverageScore() {
        if (Quiz == 0)
            return -1;
        else return score / Quiz;
    }
}
