
//package com.rafi;

//import java.io.*;

//public class CheckedException {
    /* Checked exceptions are checked at compile time
   meaning that if a method is throwing a checked exception then it should handle the
   exception using THROWS keyword, otherwise the program will give a compilation error.
     */

   // public static void main(String[] args)  {

        /* this constructor FileInputStream (File filename)
        throws FileNotFoundException which is a checked exception.
         */
      //  FileInputStream CheckedException;
        //CheckedException = new FileInputStream("B:/myfile.txt");
      //  int k;
    /* method read () of FileInputStream class also throws a checked
    exception: IOException
     */
   // while ((k = CheckedException.read()) != -1)
   // {
       // System.out.println((char) k);
   // }
    /* this method close () closes the file input stream it THROWS IOException,
     */
        //CheckedException.close();
   // }
//}

// not working... i think

// https://beginnersbook.com/2013/04/java-checked-unchecked-exceptions-with-examples/
