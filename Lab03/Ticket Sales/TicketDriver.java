public class TicketDriver
{
  public static void main(String[]args)
  {
    Walkup walk = new Walkup();
    Advance adv = new Advance(5);
    StudentAdvance stadv = new StudentAdvance(10);
    System.out.println(walk);
    System.out.println(adv);
    System.out.println(stadv);
  }
}