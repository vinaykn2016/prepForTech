package restaurant.Mangagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class InventoryMangagement {

  public static void readAvailableIngredients() {
    try{
      File file = new File("/home/vinaykn/Downloads/codes/New_Dh_Analytics/prepfortech/RestaurantManagementSystem/src/main/java/resources/Ingredients.txt");
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      StringBuffer sb = new StringBuffer();
      String line;
      while ((line=br.readLine())!=null){
        sb.append(line);
        sb.append("\n");
      }
      fr.close();
      System.out.println("Content :" + sb.toString());
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  public static enum enumIngredients
  {

//    Tomato ,
//    Potato ,
//    Onions ,
//    Batter ,
//    Spices ,
//    Milk ,
//    CoffeePowder ,
//    TeaLeaves ,
//    Oregano ,
//    Cheese ,
//    Yoghurt ,
//    Bread ,
//    Capsicum ;

    TOMATO(10,50),
    POTATO(5 ,30),
    ONION(4,45),
    BATTER(2,90),
    SPICES(3,100),
    MILK(2,50),
    COFFEEPOWDER(7,30),
    TEALEAVES(6,40),
    OREGANO(3,10),
    CHEESE(4,150),
    YOGHURT(2,30),
    BREAD(30,3),
    CAPSICUM(2,10);

    enumIngredients() {

    }

    public int getQuantity() {
      return quantity;
    }

    public void setQuantity(int quantity) {
      this.quantity = this.quantity;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    private int quantity;
    private double price;

    enumIngredients(int quantity, double price) {
      this.quantity = quantity;
      this.price = price;
    }
    @Override
    public String toString() {
      return "Ingredients : Current quantity is " +quantity+ " .Price for each is  : "+price;
    }
  }

  public static void viewIngredients(){
    for (enumIngredients ingredients:enumIngredients.values()){
      System.out.println(ingredients.name() + " " + ingredients);
    }
  }
}
