package com.inputoutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
             pw = new PrintWriter("myfile.txt");
            pw.println("Hello World");

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());

        }
    finally {
            pw.close();
        }

    }


    }

    // in this program we created a .txt file with help of PrintWriter Class.


