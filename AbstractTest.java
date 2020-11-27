import java.util.Scanner;

abstract class Test{

  abstract void test();
}

 class Shape extends Test{
  int l,b;
  float r;

  double area;
  Shape(int l){
    this.l = l;
    //b = l;
  }

  Shape(){

  }
  Shape(float r){
    this.r = r;
  }

  Shape(int l, int b){
    this.l = l;
    this.b = b;
  }

   //abstract  void area();

  void display(){
    System.out.println("***** Area ******");
  }


}

class Circle extends Shape{

  final double PI = 3.14;
  Circle(float r){
    super(r);
  }

  void area(){
    area = PI * Math.pow(r,2);
  }

  void display(){
    super.display();
    System.out.println("Area of Circle is = "+area);
  }


}

class Rectangle extends Shape{

  //final double PI = 3.14;
  Rectangle(int l, int b){
    super(l,b);
  }
  void area(){
    area = l*b;
  }

  void display(){
    super.display();
    System.out.println("Area of Rectangle is = "+area);
  }
}

class Square extends Shape{

  Square(int l){
    super(l);
  }
  //final double PI = 3.14;
  void area(){
    area = Math.pow(l,2);
  }

  void display(){
    super.display();
    System.out.println("Area of square is = "+area);
  }
}

class AbstractTest{
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

      System.out.println("Enter Radius");
      Circle ci = new Circle(sc.nextFloat());
      ci.area();
      ci.display();

      System.out.println("Enter Length and breadth");
      Rectangle re = new Rectangle(sc.nextInt(), sc.nextInt());
      re.area();
      re.display();

      System.out.println("Enter side");
      Square sq = new Square(sc.nextInt());
      sq.area();
      sq.display();

      //Shape sh = new Shape();
      //sh.display();


  }
}
