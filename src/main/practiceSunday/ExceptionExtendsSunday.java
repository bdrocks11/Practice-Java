package com.practiceSunday;

class ExceptionExtend extends Exception {

    String str1;

    ExceptionExtend(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("MyExcetion Occurred: " + str1);
    }
}
class ExceptionExtendsSunday{
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");

            throw new ExceptionExtend("This is my error Message");
        }
     catch (ExceptionExtend exp){
         System.out.println("catch block");
         System.out.println(exp);
     }
    }
}

// why are there two class? and which class should be associated with naming of Class file.


