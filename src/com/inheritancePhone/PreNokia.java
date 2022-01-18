package com.inheritancePhone;

public abstract class PreNokia implements SymbianPhone {
    // abstract class at least

     // abstract class has unimplemented methods with implemented method.

// implements calls interface( interface has no implemented method
    @Override
    public void call() {
        System.out.println("Call method is in PreNokia Class.");
    }

    @Override
    public void text() {
        System.out.println("Send text method is in PreNokia Abstract Class");
    }
    abstract public void phoneBook();
}
