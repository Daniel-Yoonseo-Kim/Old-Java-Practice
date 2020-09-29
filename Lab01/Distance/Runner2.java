import java.util.Scanner;
public class Runner2
{
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the x-coordinate for point 1:");
    int x1 = kb.nextInt();
    System.out.println("Enter the y-coordinate for point 1:");
    int y1 = kb.nextInt();
    System.out.println("Enter the x-coordinate for point 2:");
    int x2 = kb.nextInt();
    System.out.println("Enter the x-coordinate for point 2:");
    int y2 = kb.nextInt();
    Distance obj = new Distance(x1, y1, x2, y2);
    System.out.printf("distance = %.3f", obj.getDist());
  }
}