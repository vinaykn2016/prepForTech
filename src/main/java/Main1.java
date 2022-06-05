public class Main1 extends Beta{


  @Override
  public void First() {
    System.out.println("This is First Method");
  }

  @Override
  public void Second() {
    System.out.println("This is Second Method");
  }

  public static void main(String[] args) {
    Beta a = new Main1();
    a.Second();
    a.Third();
  }
}
