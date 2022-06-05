public class Shape {
  public int v1,v2;
  Shape(int x,int y){
    v1 = x;
    v2 = y;
  }
  public void area() {

  }
}
class Rectangle extends Shape{
  Rectangle (int a,int b){
    super(a,b);
  }
  public void area(){
    System.out.println(v1*v2);
  }
}

class Triangle extends Shape{
  Triangle(int a,int b){
    super(a,b);
  }
  public void area() {
    System.out.println(0.5*v1*v2);
  }
}