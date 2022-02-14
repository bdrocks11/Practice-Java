package com.jahidulcollection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer>studentId = new HashSet<>();

        studentId.add(121);
        studentId.add(123);
        studentId.add(123);
        studentId.add(124);
        studentId.add(125);
        System.out.println(studentId);

        // Set, does not allow doubles or same value.
        // as you can see once you print, only 4 of 5 value would print.

    }
}
