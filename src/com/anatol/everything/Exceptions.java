package com.anatol.everything;

public class Exceptions {

    public static void main(String[] args) {
        try {
            int a = 40, b = 0;
            int c  = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Nu putem imparti la zero");
        }


    }
}
