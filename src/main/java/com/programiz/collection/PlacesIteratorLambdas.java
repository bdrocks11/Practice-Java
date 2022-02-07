package com.programiz.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PlacesIteratorLambdas {

    // create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // prepare the data
    public static List getPlaces(){
        // add places and country to our list;
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;

    }

    public static void main(String[] args) {
        List<String> myplaces = getPlaces();
        System.out.println("Places from Nepal");
        // filter places from Nepal;
        myplaces.stream()
                .filter((p)->p.startsWith("Nepal"))
                .map((p)->p.toUpperCase())
                .sorted()
                .forEach((p)-> System.out.println(p));
    }
}
/*
Here, we are using the methods like filter(), map() and forEach() of the
Stream API. These methods can take a lambda expression as input.
 */