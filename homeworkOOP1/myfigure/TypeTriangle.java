package com.netcracker.homeworkOOP1.myfigure;

public enum TypeTriangle {
    SCALENE, ISOSCELES, EQUILATERAL;

    private static final TypeTriangle[] VAL = values();

    public String nameLowerCase() {
        return name().toLowerCase();
    }
}
