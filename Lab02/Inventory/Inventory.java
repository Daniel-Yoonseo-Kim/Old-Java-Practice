public class Inventory
{
  private String itemManu;
  private String itemName;
  private String itemCat;
  private int UPC;
  private int itemPrice;
  public Inventory(String manu, String name)
  {
    itemManu = manu;
    itemName = name;
    itemCat = "Undefined";
    UPC = (int)(Math.random() * 1000000000)+1;
  }
  public Inventory(String manu, String name, String cat, int price)
  {
    itemManu = manu;
    itemName = name;
    itemCat = cat;
    UPC = (int)(Math.random() * 1000000000)+1;
    itemPrice = price;
  }

  public String toString()
  {
    return "Inventory Info...\nManufacturer: " + itemManu +
    "\nItem Name: " + itemName +
    "\nItem Category: " + itemCat +
    "\nUPC#: " + UPC +
    "\nItem Price: " + itemPrice;
  }
}