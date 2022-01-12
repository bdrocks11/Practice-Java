package com.company;

public class ForLoopDemo8 {
    public static void main(String[] args) {

        int steps = 0;

        for (int distance = 0; distance <= 300; distance++) {
            System.out.println("Distance: " + distance + "\nStep " + steps);

            distance = distance +2;
            steps++;
        }
    }
}