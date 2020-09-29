import java.util.Scanner;
public class Runner1
{
  public static void main(String[]args)
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter distance:");
    int dist = kb.nextInt();
    System.out.println("Enter number of hours:");
    int hrs = kb.nextInt();
    System.out.println("Enter number of minutes:");
    int min = kb.nextInt();
    Speed obj = new Speed(dist, hrs, min);
    System.out.printf("%d miles in %d hours and %d minutes = %.0f mph\n", dist, hrs, min, obj.getMPH());
  }
}