class Shape{

  String type;
  int sides;

  Shape(String type, int sides){
    this.type = type;
    this.sides = sides;
  }

  Shape(Shape s){

    type = s.type;
    sides = s.sides;

  }

    boolean equals(Shape s){
      if(type == s.type & sides == s.sides){
        return true;
      }
      else
        return false;

    }


  void display(){

    System.out.println(type + " has "+sides+" sides");
  }
}







class CopyTest{

  public static void main(String[] args) {

    Shape s1 = new Shape("Square",4);
    Shape s2 = s1;
    Shape s3 = new Shape("Square",4);
    Shape s4 = new Shape(s3);


    s2.type = "Rect";


    s1.display();
    s2.display();
    s3.display();
    s4.display();


     System.out.println("s1 == s2 "+s1.equals(s2));
     System.out.println("s1 == s3 "+s1.equals(s3));
     System.out.println("s1 == s4 "+s1.equals(s4));

  }
}
