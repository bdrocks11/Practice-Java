package com.inputoutput;
import java.io.*;
import java.io.IOException;
public class CreateFile {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\abusu\\LearnJava\\src\\com\\inputoutput");
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File has been created successfully");
            }
            else {
                System.out.println("File already present at the specified location");
            }

        } catch (IOException e) {
            System.out.println("Exception Occurred : ");
            e.printStackTrace();
        }

    }
}