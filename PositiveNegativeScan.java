import java.util.Scanner;

public class PositiveNegativeScan
{
public static void main (String [] args)
{
int number;
Scanner scan = new Scanner (System.in);
System.out.print ( "Enter the number you wan to check:");
number = scan.nextInt ();
scan.close();
if (number > 0)
{
System.out.println (number + " is positive number");
}
else if (number< 0)
{
System.out.println (number+ "is negative number");
}
else
{
System.out.println ( number + " is neither positive nor negative"); 
}
}
}
