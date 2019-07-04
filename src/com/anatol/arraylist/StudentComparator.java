package com.anatol.arraylist;

import java.util.Comparator;

public class StudentComparator {

    private int age;
    private String name;
    private String gender;

    public StudentComparator(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static Comparator<StudentComparator> studentComparator = new Comparator<StudentComparator>() {
        @Override
        public int compare(StudentComparator s1, StudentComparator s2) {
            String name1 = s1.getName().toUpperCase();
            String name2 = s1.getName().toUpperCase();
            return name1.compareTo(name2) ;
        }
    };

    @Override
    public String toString() {
        return "StudentComparator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
