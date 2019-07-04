package com.anatol.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparator {

    public static void main(String[] args) {
        List<StudentComparator> studentList2 = new ArrayList<>();

        studentList2.add(new StudentComparator(21, "Anatol", "Male" ));
        studentList2.add(new StudentComparator(20, "Nicolae", "Male" ));
        studentList2.add(new StudentComparator(20, "Dinu", "Male" ));
        studentList2.add(new StudentComparator(18, "Corina", "Female"));

        System.out.println("Sorting by name: ");

        Collections.sort(studentList2, StudentComparator.studentComparator);

        for(StudentComparator str: studentList2){
            System.out.println(str);
        }

    }
}
