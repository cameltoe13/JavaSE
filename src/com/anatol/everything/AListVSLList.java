package com.anatol.everything;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : Anatol
 * @since : 18.07.2019, J
 **/
public class AListVSLList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        add("ArrayList: " , arrayList);
        add("LinkedList: " , linkedList);

    }

    public  static void add(String type, List<Integer> list){
        //long time1 = System.currentTimeMillis();

        for (int i = 0; i < 1e5; i++){
            list.add(i);
        }
        long time1 = System.currentTimeMillis();
        //long time2 = System.currentTimeMillis();
//        for (int i = 0; i < 1e5; i++){
//            list.add(0,i);
//        }
       // long time2 = System.currentTimeMillis();

        //float sec = time1 / 1000F;

        System.out.println(type  +  " " + (time1 + " " + "miles"));
    }
}
