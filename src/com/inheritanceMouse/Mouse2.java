package com.inheritanceMouse;

public class Mouse2 extends Mouse1 {

    public static void main(String[] args) {
        Mouse2 mouse2 = new Mouse2();
        mouse2.leftClick();
        mouse2.rightClick();
mouse2.scrollUp();
// because at first we didn't call or implemented scrollUp; it gave up compile time error;
        mouse2.scrollDown();
    }
    public void scrollDown(){
        System.out.println("Scroll Down; located on Mouse2 Class");

    }

    @Override
    public void scrollUp() {
        System.out.println("scroll " +
                "Up; located on Mouse2 Class");
    }
}


