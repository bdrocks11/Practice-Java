package com.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private static Scanner scan;

    public static void main(String[] args) throws FileNotFoundException {
// exception added just incase the file cannot be found
File file = new File("src/JavaReadFile.docx");
// locates the file
        Scanner scan = new Scanner(file);
        //scanner to scan lines
        System.out.println(scan.nextLine());



    }
}
