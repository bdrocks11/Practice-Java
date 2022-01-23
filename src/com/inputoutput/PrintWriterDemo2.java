package com.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintWriterDemo2 {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File ("myfile.txt");
        try {
            Scanner fs = new Scanner(f);
        }
        catch  (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}
