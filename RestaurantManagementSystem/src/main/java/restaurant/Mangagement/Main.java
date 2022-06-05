package restaurant.Mangagement;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the available options: " + "1.View Available Ingredients "
          + "\n 2.Order Specific Ingredients"
          + "\n 3.View Total Sales "
          + "\n 4.View Total Expense "
          + "\n 5.View Net Profit "
          + "\n 6.Place Order "
          + "\n 7.Exit from the programme" );
      Scanner scan=new Scanner(System.in);

      while (scan.hasNextLine()){

        try {
          int option = Integer.parseInt(scan.nextLine());
          switch (option) {
            case 1:
                InventoryMangagement.viewIngredients();
                break;
            case 2:
              System.out.println("Enter the name of the ingredient");
              String name = scan.nextLine();
              System.out.println("Enter how much qty of ingredients is required");
              int qty = Integer.parseInt(scan.nextLine());
              OrderMangagement.orderSpecificIngredient(name,qty);
              break;
            case 7:
              System.out.println("Exiting from the program");
              break;
          }
        } catch (NumberFormatException e) {
          throw new RuntimeException(e);
        }
      }


  }

}
