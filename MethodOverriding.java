import java.util.Scanner;
class Shape{

  int l,b;
  float r;
  double area;

  Shape(float r){

    this.r = r;
  }

  Shape(int l){

    this.l = l;
  }

  Shape(int l, int b){

    this.l = l;
    this.b = b;
  }

  void area(){
    System.out.println("Compute Area");
  }
  void display(){
    System.out.println("This is display method in Parent Class");
  }

}

class Circle extends Shape{

  final double PI = 3.14;
  Circle(float r){

    super(r);
  }

  void area(){
    super.area();
    area = PI * Math.pow(r,2);
  }

  void display(){

    System.out.println("Area of circle = "+area);
  }

}

class Square extends Shape{


  Square(int l){

    super(l);
  }

  void area(){
    super.area();
    area = Math.pow(l,2);
  }

  void display(){

    System.out.println("Area of Square = "+area);
  }

}

class Rectangle extends Shape{


  Rectangle(int l, int b){

    super(l,b);
  }

  void area(){

    super.area();
    area = l * b;
  }

  void display(){

    System.out.println("Area of Rectangle = "+area);
  }

}




class MethodOverriding{

  public static void main(String[] args) {


    System.out.println("Calculate Area 1. Cicle 2. Rectangle 3. Square");
    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();
    Shape sh;   //Refrence varibale of Parent Class
    switch(ch){

      case 1:
            sh = new Circle(2.5f);
            break;
      case 2:
            sh = new Rectangle(5,8);
            break;

      case 3:
            sh = new Square(21);
            break;

      default :
              System.out.println("Invalid Choice");
              return;
    }

    sh.area();
    sh.display();



  }
}
