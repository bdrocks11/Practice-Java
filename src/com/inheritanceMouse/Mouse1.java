package com.inheritanceMouse;

public abstract class Mouse1 implements Mouse {

    public void rightClick (){
        System.out.println("Click; located on Mouse Class");

    }
    public void leftClick (){
        System.out.println("Click; located on Mouse Class");
    }
    public abstract void scrollUp();

}
