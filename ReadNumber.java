import java.util.Scanner;

public class ReadNumber {

public static void main (String[] args) {

	/* This reads the input provided by user using keyboard */

Scanner scan = new Scanner(System.in);
System.out.print ("Enter any number: ");

// this  method reads the  number provided using keyboard

int num = scan.nextInt();

//Closing scanner after the use

scan.close();

//displaying the number

System.out.println ("The number entered by user: "+num);

}
}
