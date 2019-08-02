package com.anatol.everything;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : Anatol
 * @since : 02.08.2019, V
 **/
public class GetElementRandomFromArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(24);
        list.add(97);
        list.add(235);
        list.add(4);
        list.add(-8);
        list.add(74);

        GetElementRandomFromArray getElementRandomFromArray = new GetElementRandomFromArray();
        System.out.println(getElementRandomFromArray.getRandomElement(list));

    }

    public int getRandomElement(List<Integer> list){

        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }



}
