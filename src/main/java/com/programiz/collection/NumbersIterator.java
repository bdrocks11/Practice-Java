package com.programiz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class NumbersIterator {

    public static void main(String[] args) {

        //creating ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList " + numbers);

        // creating an instance of Iterator

        Iterator<Integer> iterate = numbers.iterator();

        // using the next() method

        int number = iterate.next();
        System.out.println("Accessed Element" + number);

        //using remove() method

        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.println("updated ArrayList: ");

        // using the hashNext() method

        while (iterate.hasNext()){
            //using the forEachRemaining() method;
            iterate.forEachRemaining((value) -> System.out.println(value + ","));
/*
("->" Here, we have passed the lambda expression as an argument of the forEachRemaining() method.

Now the method will print all the remaining elements of the array list.
 */

        }

    }
}
