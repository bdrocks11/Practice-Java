package com.jahidulcollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Character> result = new HashMap<>();

        // in Map, we can store key and value of different data type.
        // here we are storing, string type for student name
        // and for result we are using Character.

        result.put("John", 'A');
        result.put("Jack", 'B');
        result.put("Rack", 'C');

        for (Map.Entry<String, Character> m: result.entrySet()){
            /*
             A map entry (key-value pair).
             The Map.entrySet method returns a collection-view of the map,
              whose elements are of this class.

             */
            System.out.println(m.getKey() + " " + m.getValue());
            /* in print we are getting key and getting value, quotation was used
            for space in between.
            */
        }
    }

}
// cannot have duplicate elements,

/// duplicate keys are not allowed.
// but duplicate values are allowed.
