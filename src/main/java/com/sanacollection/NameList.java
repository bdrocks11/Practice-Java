package com.sanacollection;

import java.util.*;
import java.util.Iterator;

public class NameList {
    public static void main(String[] args) {

        ArrayList<String> mylist=new ArrayList<String>();
        mylist.add("one");
        mylist.add("two");
        mylist.add("three");
        mylist.add("four");
        mylist.add("one");


        Iterator itr=mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
// array list maintains order and allows duplicate