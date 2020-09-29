public class GameRunner
{
  public static void main(String[]args)
  {
    GameSystem xbox = new Xbox("Xbox");
    GameSystem playstation = new PlayStation("PlayStation");
    GameSystem pc = new PC("PC");
    System.out.println(xbox);
    System.out.println(playstation);
    System.out.println(pc);
  }
}