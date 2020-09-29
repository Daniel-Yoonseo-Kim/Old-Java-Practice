public class PC extends GameSystem
{
  public PC()
  {
    super();
  }
  public PC(String p)
  {
    super(p);
  }
  public String systemInput()
  {
    return "Keyboard and Mouse";
  }
  public String toString()
  {
    return "Platform: " + getPlatform() + "\nSerial #: " + getSerial() + "\nSystem Input: " + systemInput();
  }
}