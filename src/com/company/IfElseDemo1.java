package com.company;

import com.sun.org.apache.xpath.internal.operations.Equals;

import static java.lang.System.*;

public class IfElseDemo1 {
    public static void main(String[] args) {

        char initial = 'a';

        if (initial == ('a')){
            // make sure to put two equal sign to call a method. (==);
            System.out.println("your name starts with letter A");
        } else out.println("name does not start with letter A");
    }
}
