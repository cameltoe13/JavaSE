package com.anatol.everything;

/*Crl + Alt +O
delete unused imports*/

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Integer[] list = new Integer[] {3, 7, 1, 2, 0, 9};

        Arrays.sort(list);

        for(int i : list){
            System.out.println(i);
        }

    }

}
