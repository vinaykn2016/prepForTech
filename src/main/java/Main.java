public class Main {
  private enum Currency {
    PENNY("1 rs"), NICKLE("5 rs"), DIME("10 rs"), QUARTER("25 rs");
    private String value;
    private Currency(String brand) {
      this.value = brand;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public static void main(String[] args) {

    Currency[] currencies = Currency.values();

    // enum name using name method
    // enum to String using toString() method
    for (Currency currency : currencies) {
      System.out.printf("[ Currency : %s, Value : %s ]%n",currency.name(),currency);
    }
  }
}