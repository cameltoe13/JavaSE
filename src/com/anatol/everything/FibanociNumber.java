package com.anatol.everything;

public class FibanociNumber {

    static int fibanoci(int n){
        if (n <= 1)
            return n;
        return fibanoci(n-1) + (n - 2);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibanoci(n));
    }
}
