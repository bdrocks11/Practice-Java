package com.sana.sanacollection;

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

/*
System.out.println(“ List before remving element”);
        Iterator itr=mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

Mylist.remove(1);    // position at which we want to delete elemet
System.out.println(“List after deletion”);
        Iterator itr=mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
 */