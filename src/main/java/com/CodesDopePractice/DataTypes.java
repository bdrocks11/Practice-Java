package com.CodesDopePractice;

public class DataTypes {
    /* we will input as many data types we can here with
    examples and meaning of each data types
     */
    public static void main(String[] args) {
        DataTypes obj = new DataTypes();

        obj.dataInt();
        obj.dataDouble();
        obj.dataFloat();
        obj.dataChar();
        obj.dataString();
        obj.dataStringInt();
        obj.dataBoolean();
        obj.division();


    }


    public void dataInt() {
        int num;
        num = 10;
        System.out.println(num);

        /* the int data type is used to store integers. Integers are numbers which
        don't have decimal. for example -5,0,6, etc
         */
        /* the variable num is declared of type int and is assigned an integer value 10.
         */
    }

    public void dataDouble() {
        double num;
        num = 10.5;
        System.out.println(num);
     /* Double data type is used to store double-precision 64 bit floating point
     numbers. floating point numbers are numbers which have decimal. in other
     words the double data type is used to store numbers having decimal. for
     example -5.64, 10.228
      */
    }

    public void dataFloat() {
        float num;
        num = 10.5f;
        System.out.println(num);
     /*
     Float data is used to store single precision 32-bit floating point numbers.
     a Float value should always end with f or F. for example,-5.64f,/// 10.228f.
      */
    }
    public void dataChar(){
        char ch;
        ch = 'e';
        System.out.println(ch);
        /* Char data type is used to store a character. a character value must
        be written within single quotes '' /// for example 'b' 'B' '@'
         */
    }
    public void dataString(){
        String msg;
        msg = "Let's learn java";
        System.out.println(msg);
        /* String data type is used to store a String.
        String value must be enclosed in double quotes ""// any value enclosed
        with double quotes is a String. example "Hello"//"Hello123'//"123"
         */
    }
    public void dataStringInt(){
        String b = "10+2";
        int a = 10+2;
        System.out.println(a);
        System.out.println(b);

        /* realize how string does not add it displays the message as
        ("10+2")
         */
    }
public void dataBoolean(){
        boolean a, b;
        a = true;
        b = false;
    System.out.println(a);
    System.out.println(b);

    /*boolean data type consists of two values -true and -false.

     */

    }

    public void division(){
        int sum = 23;
        int n = 7;
        double avg;
        avg = (double) sum/ n;
        System.out.println("Average " + avg);
    }



}

