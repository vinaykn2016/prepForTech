public class newAlpha {

  class A{
    int a,b;
    void show(){
      System.out.println(a+ " " + b);
    }
  }

  class B extends A{
    int c;
    void show() {
      System.out.println(c);
    }
  }

  public class Test extends A {

    }
  }

