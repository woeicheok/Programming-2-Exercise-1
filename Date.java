import java.util.Scanner;
public class Date
{
public static void main (String[] args)
{

Scanner sc = new Scanner(System.in);
   System.out.println("Please Enter A Date according by date/month/year: ");
   String date = sc.next();
   String change;
   change = date.replace('/' , '.');
   System.out.println(change);
   }
   }