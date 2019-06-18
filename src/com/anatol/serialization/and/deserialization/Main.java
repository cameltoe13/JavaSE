package com.anatol.serialization.and.deserialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Anatol", 24, "Male");
        Person person2 = new Person("Nicolae", 23, "Male");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("file1.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            objectOutputStream.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(new File("file1.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person pr1 = (Person) objectInputStream.readObject();
            Person pr2 = (Person) objectInputStream.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException e){
            System.out.println("Error in initializing stream");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
