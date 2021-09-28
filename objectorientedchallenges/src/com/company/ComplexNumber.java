package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = getReal() + real;
        this.imaginary = getImaginary() + imaginary;
    }

    public void add(ComplexNumber number){
        this.real = getReal() + number.real;
        this.imaginary = getImaginary() + number.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real = getReal() - real;
        this.imaginary = getImaginary() - imaginary;
    }

    public void subtract(ComplexNumber number){
        this.real = getReal() - number.real;
        this.imaginary = getImaginary() - number.imaginary;
    }
}




