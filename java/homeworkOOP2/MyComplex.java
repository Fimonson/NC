package com.netcracker.homeworkOOP2;

import java.math.BigDecimal;

public class MyComplex {
    private double real, imag;

    public MyComplex() {
        this(0, 0);
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (this.real != 0) {
            result.append(this.real);
        }

        if (this.imag != 0) {
            if (this.real != 0) {
                if (this.imag > 0) {
                    result.append(" + ");
                } else {
                    result.append(" - ");
                }
            }

            if (this.imag == -1 || this.imag == 1) {
                result.append("i");
            } else {
                result.append(Math.abs(this.imag)).append("i");
            }
        }

        if (this.real == 0 && this.imag == 0) {
            result.append("0");
        }

        return "(" + result.toString() + ")";
    }

    public boolean isReal() {
        return Double.compare(real, 0.0d) != 0;
    }

    public boolean isImaginary() {
        return Double.compare(imag, 0.0d) != 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyComplex that = (MyComplex) o;
        return Double.compare(that.real, this.real) == 0 && Double.compare(that.imag, this.imag) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) real;
        result = 31 * result + (int) imag;
        return result;
    }

    public boolean equals(MyComplex op2) {
        return equals(op2.real, op2.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real) + (real < 0 ? Math.PI : 0);
    }

    public MyComplex add(MyComplex op2) {
        this.real += op2.real;
        this.imag += op2.imag;

        return this;
    }

    public MyComplex addNew(MyComplex op2) {
        return new MyComplex(this.real + op2.real, this.imag + op2.real);
    }

    public MyComplex subtract(MyComplex op2) {
        this.real -= op2.real;
        this.imag -= op2.imag;

        return this;
    }

    public MyComplex addSubtract(MyComplex op2) {
        return new MyComplex(this.real - op2.real, this.imag - op2.real);
    }

    public MyComplex multiply(MyComplex op2) {
        this.real = this.real * op2.real - this.imag * op2.imag;
        this.imag = this.real * op2.imag + op2.real * this.imag;

        return this;
    }

    public MyComplex divide(MyComplex op2) throws ArithmeticException {
        if (op2.real == 0 && op2.imag == 0) {
            throw new ArithmeticException("division by zero");
        }

        double q = Math.pow(op2.real, 2) + Math.pow(op2.imag, 2);
        this.real = (this.real * op2.real + this.imag * op2.imag) / q;
        this.imag = (op2.real * this.imag - this.real * op2.imag) / q;

        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, (-1) * this.imag);
    }

    public static void main(String[] args) {

        MyComplex mc1 = new MyComplex(3, 3);
        MyComplex mc2 = new MyComplex(1, 4);
        MyComplex mc3 = new MyComplex(1, -3);

        System.out.println(mc1.toString());
        mc3.setValue(2, -4);
        System.out.println(mc3.toString());
        System.out.println(mc2.isImaginary());

        System.out.println(mc3.equals(new MyComplex(2, -4)));
        System.out.println(mc3.equals(2, -4));

        System.out.println(mc2.magnitude());
        System.out.println(mc2.argument());

        mc1.add(new MyComplex(3, -2));
        System.out.println(mc1.toString());

        MyComplex mc4 = mc1.addNew(new MyComplex(3, -2));
        System.out.println(mc1.toString());
        System.out.println(mc4.toString());

        mc2.multiply(mc1);
        System.out.println(mc2);

        System.out.println(mc1.conjugate());
        System.out.println(mc1.conjugate());

        System.out.println();
    }
}
