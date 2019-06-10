package com.anatol.everything;

public class FibonacciSeries {

    static int n0 = 0, n1 = 1, n2 = 0;

    static void printFibonacci(int count){
        if (count > 0){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(" " + n2);
            printFibonacci(count - 1);
        }

    }

    public static void main(String[] args) {
        int count = 10;
        System.out.print(n0  + " " + n1);
        printFibonacci(count - 2);
    }
}
