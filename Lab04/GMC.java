public class GMC implements Location
{
  private int xcoord, ycoord;
  private int ID = (int)(Math.random() * 1000000) + 1;
  private double[] location = new double[2];
  public GMC()
  {
    xcoord = 0;
    ycoord = 0;
  }
  public GMC(int x, int y)
  {
    xcoord = x;
    ycoord = y;
  }
  public int getID()
  {
    return ID;
  }
  public void move(int x, int y)
  {
    xcoord += x;
    ycoord += y;
  }
  public double[] getLoc()
  {
    location[0] = xcoord;
    location[1] = ycoord;
    return location;
  }
}