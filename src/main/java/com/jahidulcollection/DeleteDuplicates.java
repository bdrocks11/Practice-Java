package com.jahidulcollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteDuplicates {
    public static void main(String[] args) {

        List<String> arrlst = new ArrayList<>();
        arrlst.add("tech");
        arrlst.add("beamers");
        arrlst.add("java");
        arrlst.add("python");
        arrlst.add("selinium");
        arrlst.add("Shell");
        arrlst.add("Shell");

        // displaying ArrayList elements
        System.out.println("Before");
        System.out.println("ArrayList contains " + arrlst);


        //creating LinkedHashSet
        LinkedHashSet<String> linkhs = new LinkedHashSet<>();
        linkhs.addAll(arrlst);
        // above we added all ArrayList to LinkedHashSet
        // doing this to remove duplicate elements.

        // below we will remove ArrayList elements

        arrlst.clear();

        arrlst.addAll(linkhs); // adding the LinkedHashSet elements to ArrayList

        // displaying ArrayList elements
        System.out.println("After");

        System.out.println("ArrayList contains " + arrlst);
    }
}
