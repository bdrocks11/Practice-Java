package com.sana.sanacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class NameStack {

    public static void main(String[] args) {

       Stack<String> mylist=new Stack<>();
        mylist.push("one");
        mylist.push("two");
        mylist.push("three");
        mylist.push("four");
        mylist.push("five");


        System.out.println(mylist.peek());

        Iterator itr=mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
