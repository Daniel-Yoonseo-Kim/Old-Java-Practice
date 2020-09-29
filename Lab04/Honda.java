public class Honda implements Location
{
  private double[] location = new double[2];
  private int ID = (int)(Math.random() * 1000000) + 1;
  private double xcoord;
  private double ycoord;
  public Honda()
  {
    xcoord = 0;
    ycoord = 0;
  }
  public Honda(double[] loc)
  {
    xcoord = loc[0];
    ycoord = loc[1];
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