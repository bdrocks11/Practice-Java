package com.sana.sanacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class NameListRemove {


    public static void main(String[] args) {

      /*  ArrayList<String> mylist = new ArrayList<String>();


        mylist.add("one");
        mylist.add("two");
        mylist.add("three");
        mylist.add("four");


        System.out.println("List before removing element");
        Iterator itr = mylist.iterator();  // declared iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        mylist.remove(1);    // position at which we want to delete elemet
        System.out.println("List after deletion");
        System.out.println("After removing the element the size of the ArrayList is: " + mylist.size());
        Iterator itr1 = mylist.iterator();  // repeated iterator
        while (itr1.hasNext()) {
            System.out.println(itr1.next());


            mylist.remove("four");    // value of element we want to delete
            System.out.println("List after deletion using index method");
            System.out.println("After removing the element the size of the ArrayList is: " + mylist.size());
            Iterator itr2 = mylist.iterator();
            while (itr2.hasNext()) {
                System.out.println(itr2.next());*/


        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(13);
        mylist.add(9);
        mylist.add(22);
        mylist.add(14);


      /*  System.out.println("List after removing element");
        Iterator itr1 = mylist.iterator();
        while (itr1.hasNext()) {
            int num = (Integer) itr1.next();
            if (num >= 14)
                itr1.remove();
        }

        Iterator itr = mylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

       */
       /* for(Integer temp :  mylist)                        // second way of moving through list (another way to iterate using for loop)
        System.out.println("my list element " + temp);
        */
        for(int i=0; i<mylist.size(); i++)                    // third way of moving through list
        {
            System.out.println(mylist.get(i));
        }
    }

    }




