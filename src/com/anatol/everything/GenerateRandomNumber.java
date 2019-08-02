package com.anatol.everything;

import java.util.Random;

/**
 * @author : Anatol
 * @since : 02.08.2019, V
 **/
public class GenerateRandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 1; i <= 5; i++){
            System.out.println(random.nextInt(200));
        }
    }
}
