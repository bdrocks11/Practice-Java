package com.jahidulcollection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();

        studentList.add("John");
        studentList.add("jack");
        studentList.add("jack jr");
        studentList.add("jack");
        studentList.add("Jack Jr");

        System.out.println( "Number of students: " + studentList.size() );

        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i));
        }
    for (String str :studentList) {
        System.out.println("Student name  " + str);
        System.out.println("number of students before removal " + studentList.size());
// this is a for each loop, it works same for for loop or while loop
        /* we use the semicolon inside the parenthesis to seperate the target
        which is on the right side, the target is the studentList in this
        class. on the left side of the semicolon, we put the data type follow
        by a object to call the target, as in this example we
        used (str) to call studentList.

         */
        }
    studentList.remove(1) ;
            System.out.println("number of students after removal are " + studentList.size());
            System.out.println("print " + studentList);
        }
   /* by using the remove method, in this case we removed index number 1;
   index 1 stored name jack;
    */
    }


