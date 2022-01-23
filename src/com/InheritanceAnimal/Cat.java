package com.InheritanceAnimal;

import static java.awt.Color.white;

public class Cat extends Animal {
    private String color;
    public Cat (boolean veg, String food, int legs){
        Super(veg, food, legs);
        this.color = String.valueOf(white);

    }

    private void Super(boolean veg, String food, int legs) {
    }

    public Cat (boolean veg, String food, int legs, String color){
        super(veg,food,legs);
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor (String color){
        this.color =color;
    }

}
