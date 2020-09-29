import java.lang.Math;
public class Speed
{
  private int dist, hrs, min;
  private double mph;
  public Speed()
  {
    dist = hrs = min = 0;
    mph = 0;
  }
  public Speed(int d, int h, int m)
  {
    dist = d;
    hrs = h;
    min = m;
    mph = 0;
  }
  public void setValues(int d, int h, int m)
  {
    dist = d;
    hrs = h;
    min = m;
    mph = 0;
  }
  public double getMPH()
  {
    mph = Math.round(dist / (hrs + (min / 60.0)));
    return mph;
  }
}