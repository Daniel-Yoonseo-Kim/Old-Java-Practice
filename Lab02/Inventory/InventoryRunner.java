import java.util.Scanner;
public class InventoryRunner
{
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter an item:");
    String name = kb.nextLine();
    System.out.println("Enter the item manufacturer:");
    String manu = kb.nextLine();
    System.out.println("Will you be entering category and price information? (Yes or No)");
    String answer = kb.next();
    if(answer.toLowerCase().equals("yes"))
    {
      System.out.println("Please enter category:");
      kb.nextLine();
      String category = kb.nextLine();
      System.out.println("Please enter item price:");
      int price = kb.nextInt();
      Inventory item1 = new Inventory(manu, name, category, price);
      System.out.println("\n"+item1);
    }
    else
    {
      Inventory item1 = new Inventory(manu, name);
      System.out.println("\n"+item1);
    }
  }
}