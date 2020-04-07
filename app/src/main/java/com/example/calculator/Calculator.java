package com.example.calculator;

public class Calculator {

    public double currentResult;

    public Calculator()
    {

        currentResult = 0;
    }

    public double add(double a, double b)
    {
        currentResult = a+b;
        return currentResult;
    }

    public double subtract(double a, double b)
    {
        currentResult = a-b;
        return currentResult;
    }

    public double multiply(double a, double b)
    {
        currentResult = a*b;
        return currentResult;
    }
    public double power(double a,double b)
    {
        currentResult = Math.pow(a, b) ;
        return currentResult;
    }
    public double fact(double a)
    {
        currentResult = 1;

        for (int factor = 2; factor <= a; factor++) {
            currentResult *= factor;
        }

        return currentResult;
    }
    public double root(double a)
    {
        if(a < 0)
            throw new RuntimeException();

        currentResult= Math.sqrt(a) ;
        return currentResult;
    }
    public double modulus(double a,double b)
    {
        currentResult= a % b ;
        return currentResult;
    }
    public double divide(double a, double b)
    {
        if(b == 0)
            throw new RuntimeException();

        currentResult = a/b;


        return currentResult;
    }

}
