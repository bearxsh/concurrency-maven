package com.bearxsh;

// Immutable class with static factories instead of constructors
public class Complex {

    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

}
/*
class MyComplex extends Complex {

    public MyComplex(double re, double im) {
        super(re, im);

    }
}*/
