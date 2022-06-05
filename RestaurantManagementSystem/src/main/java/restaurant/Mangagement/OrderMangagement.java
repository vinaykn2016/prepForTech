package restaurant.Mangagement;

import restaurant.Mangagement.InventoryMangagement.enumIngredients;

public class OrderMangagement {

  public static void orderSpecificIngredient(String name, int quantity){
    enumIngredients ingredientName = null;
    boolean ingredientPresent = false;
    double amount = 0;

    for (enumIngredients ingredients: enumIngredients.values()){
      if(name.equalsIgnoreCase(ingredients.name())){
        ingredientName = enumIngredients.valueOf(ingredients.name());
        int intialQty = ingredientName.getQuantity();
        ingredientName.setQuantity(quantity + intialQty);
        ingredientPresent = true;
        amount = quantity * ingredients.getPrice();
        System.out.println("current qty is :" + ingredientName.getQuantity());
      }
    }
    if(ingredientPresent){
      AccountsManagagement bal = new AccountsManagagement(5000);
      if (amount<= bal.getBalance()){
        System.out.println("Order confirmed");
        bal.setBalance(bal.getBalance()-amount);
        System.out.println("Total amount for ingredients is :" + amount);
        System.out.println("Remaining updated Balance in Account is :" + bal.getBalance());

      }else {
        System.out.println("Insufficient Balance in Account.Please update/try again later");
      }
    }else {
      System.out.println("Mentioned Ingredient is not available in our list.Please Enter the correct Ingredient List");
    }
  }
}
