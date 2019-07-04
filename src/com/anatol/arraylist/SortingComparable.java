package com.anatol.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparable {

    public static void main(String[] args) {

        List<StudentComparable> studentList1 = new ArrayList<>();

        studentList1.add(new StudentComparable(21, "Anatol", "Male" ));
        studentList1.add(new StudentComparable(20, "Nicolae", "Male" ));
        studentList1.add(new StudentComparable(20, "Dinu", "Male" ));
        studentList1.add(new StudentComparable(18, "Corina", "Female"));

        Collections.sort(studentList1);
        //reverse order
        //Collections.sort(studentList1, Collections.reverseOrder());

        System.out.println("Sorting by age: ");

        for (StudentComparable studentComparable : studentList1)
            System.out.println(studentComparable.getAge() + " "
                    +  studentComparable.getName() + " "
                    + studentComparable.getGender());


    }
}
