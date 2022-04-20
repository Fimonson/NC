package com.netcracker.HW3.ch3;

public class StudentTester {
    public static void main(String[] args) {
        Student studentTester = new Student("Alexey");
        studentTester.addQuiz(100);
        System.out.println(studentTester.getName() + " has an average score " + studentTester.getAverageScore());
    }
}
