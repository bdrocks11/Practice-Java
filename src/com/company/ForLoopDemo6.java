package com.company;

public class ForLoopDemo6 {
    public static void main(String[] args) {


        int step = 0;
        // per step, we can cover 3 feet, we want to cover 300 feet in distance

       // for (step = 1; step <= 100; step++) {
         //   step = step + 2;
           // System.out.println("step:  " + step + ", you are walking 3 feet per step""\n );
    for (int distance=0; distance <= 300; distance++){



        System.out.println("distance: " +distance+ "\nStep count: " +step);
        step++;
        distance=distance +2;
    }
    }
}
// when i run it; i m getting 102 steps and 302 feet when i
// should only get 300 feet and 100 steps
