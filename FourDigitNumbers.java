import java.util.Scanner;
public class FourDigitNumbers
{
public static void main (String[] args)
{

Scanner sc = new Scanner(System.in);
   String num, number;
   int sumDigit = 0;
   
   System.out.println("Please Enter A four-digit number: ");
   num = sc.nextLine();
   for (int i = 0 ; i<num.length() ; i++)
   {
      System.out.println(num.charAt(i));
      number = String.valueOf(num.charAt(i));
      sumDigit = sumDigit + Integer.parseInt(number);
   }

   
   System.out.println("The sum of the digit is: " + sumDigit);
   
     }
   }
