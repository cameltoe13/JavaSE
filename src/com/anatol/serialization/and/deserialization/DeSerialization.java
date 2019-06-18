package com.anatol.serialization.and.deserialization;

import com.anatol.serialization.and.deserialization.Person;

import java.io.*;

public class DeSerialization {

    public static void main(String[] args) {

        try {

            FileInputStream fileInputStream = new FileInputStream(new File("file1.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            Person person3 = (Person) objectInputStream.readObject();

            System.out.println(person1.toString());
            System.out.println(person2.toString());
            System.out.println(person3.toString());

            objectInputStream.close();
            fileInputStream.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e){
            System.out.println("Error");
        }

    }
}
