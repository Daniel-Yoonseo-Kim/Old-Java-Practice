public class Toyota implements Location
{
  private double[] location = new double[2];
  private int ID = (int)(Math.random() * 1000000) + 1;
  private String xstring;
  private String ystring;
  private double xcoord;
  private double ycoord;
  public Toyota()
  {
    xcoord = 0;
    ycoord = 0;
  }
  public Toyota(String coord)
  {
    String[] coordinates = new String[1];
    coordinates = coord.split(", ");
    xstring = coordinates[0];
    ystring = coordinates[1];
    xcoord = Double.parseDouble(xstring);
    ycoord = Double.parseDouble(ystring);
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