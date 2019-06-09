package com.anatol.everything;

public class Recursion {

    static int factorial(int n){
        if (n == 1 || n == 0)
            return 1;
        else
            return (n = n* factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 10 is: " + factorial(10));
    }
}
