package com.practiceSunday;

public class ForLoopDemo7Sunday {
    public static void main(String[] args) {

        int steps = 0 ;
        for (int distance= 0; distance <= 300; distance ++ ){

            System.out.println( "distane " + distance + "\nStep Count " + steps);
            distance = distance + 1;
            steps++ ;
        }
    }
}
