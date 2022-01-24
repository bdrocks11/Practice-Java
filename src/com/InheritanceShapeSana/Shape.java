package com.InheritanceShapeSana;

public class Shape {

    /*Create a class named 'Shape' with a method to print "This is This is shape".
     Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class,
      both having a method to print "This is rectangular shape" and "This is circular
      shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to
       print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle'
       class by the object of 'Square' class.
     */
    public void print() {
        System.out.println("this is shape ");
    }
}
    class Rectangle extends Shape{

    public void rectangle (){
        System.out.println("this is rectangular shape");
    }


    }
    class Circle extends Shape{

    public void circle(){
        System.out.println("this is circular shape");
    }

    }
    class Square extends Rectangle{

        public static void main(String[] args) {
            Square s = new Square();
            s.rectangle();
            s.print();

        }






    /*Create a subclass 'Square' of 'Rectangle' having a method to
       print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle'
       class by the object of 'Square' class.
     */
    public void square(){
        System.out.println("Square is Rectangle");

    }

    }



