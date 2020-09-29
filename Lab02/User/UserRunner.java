import java.util.Scanner;
public class UserRunner
{
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter your first name:");
    String first = kb.next();
    System.out.println("Please enter your last name:");
    String last = kb.next();
    System.out.println("Would you like an avatar (Yes or No)?");
    String answer = kb.next();
    if(answer.toLowerCase().equals("yes"))
    {
      System.out.println("Please enter your avatar name:");
      String avatar = kb.next();
      User user1 = new User(first, last, avatar);
      System.out.println("\n"+user1);
    }
    else
    {
      User user1 = new User(first, last);
      System.out.println("\n"+user1);
    }
  }
}