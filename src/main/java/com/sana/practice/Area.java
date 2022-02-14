package com.sana.practice;

import java.util.Scanner;

public class Area {

    int length;
    int width;
public void setDim(int length, int width) {
    this.length = length;  // length in parameter is user input;

    //(this) keyword is used to identify the inside variable which is in purple;

    this.width = width; // same note as above.
}
    public int getArea(){
        int area = this.length * this.width;
        // we choose(this) because we are working inside the class.
        return area;
    }

    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        System.out.println("enter length");
       int l = rec.nextInt();
        System.out.println("enter width");
       int w = rec.nextInt();
       Area rectangle = new Area();
       rectangle.setDim(l,w);
       rectangle.getArea();
        System.out.println("area is equals to " + rectangle.getArea());
    }
}


