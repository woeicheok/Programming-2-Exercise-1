import java.util.Scanner;
public class FunnyString
{
public static void main (String[] args)
{

Scanner sc = new Scanner(System.in);  
    System.out.println("Enter A Favourite Colour: ");
    String colour = sc.nextLine();  
    System.out.println("Enter A Favourite Food: ");
    String food = sc.nextLine();    
    System.out.println("Enter An Animal: ");
    String animal = sc.nextLine();    
    System.out.println("Enter The First Name Of A Friend: ");
    String FriendName = sc.nextLine(); 
    

   
   
   
   
   
    System.out.println("I had a dream that "+ FriendName + " ate a "+ colour + " cat and said it tasted like " + food + "!");  
}
}