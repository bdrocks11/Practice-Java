package com.sanacollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class NameHashSet {


        public static void main(String[] args) {

            HashSet<String> mylist =new HashSet<String>();
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

//  does not take duplicate
// does not maintain order