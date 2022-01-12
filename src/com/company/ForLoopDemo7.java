package com.company;

public class ForLoopDemo7 {
    public static void main(String[] args) {
        //same example from class java 105
        int steps = 0;
        for (int distance = 0; distance <= 200; distance++) {

            System.out.println("Distance: " + distance + "\nStep Count: " + steps );
            distance = distance + 1;
            steps++;
        }
    }
}
