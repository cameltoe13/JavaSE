package com.anatol.everything;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayListCollectionSort {


    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Anatol");
        list.add("Marcela");
        list.add("Oxana");
        list.add("Mama");
        list.add(3, "tata");

        for (String string : list)
            System.out.println(string);

        //sorting list
        Collections.sort(list);
        for (String string : list)
            System.out.println(string);

        //reverse order
        Collections.sort(list, Collections.reverseOrder());
        for (String string : list)
            System.out.println(string);
    }



}