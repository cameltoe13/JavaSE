package com.anatol.serialization.and.deserialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {

        Person person1 = new Person("Anatol", 24, "Male");
        Person person2 = new Person("Nicolae", 23, "Male");
        Person person3 = new Person("Dinu", 23, "Male");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("file1.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Objects was serialized");

        } catch (IOException e){
            System.out.println("Error in initializing stream");
        }
    }
}
