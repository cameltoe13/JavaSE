package com.anatol.arraylist;

public class StudentComparable implements Comparable<StudentComparable>{

    private int age;
    private String name;
    private String gender;



    public StudentComparable(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(StudentComparable s) {
        return this.age - s.age;
    }
}
