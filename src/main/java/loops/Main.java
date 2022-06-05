package loops;

import java.awt.Rectangle;
import java.awt.Shape;

public class Main {

  public void First(String a){
    System.out.println("one");
  }
  public void Second (String a,String b){
    System.out.println("Two");
  }

  public void Show(){
    System.out.println("This is Base");
  }

 static class Alpha1 extends Main {
    public void show(){
      System.out.println("This is Derived");
    }
  }

  public static void main(String[] args) {

    Main a = new Main();
    a.First("This is First");
    a.Second("This is String 1","This is String 2");
    a.Show();
    Main b = new Alpha1();
    b.Show();
  }
}
