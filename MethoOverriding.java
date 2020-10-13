class Parent{

  void display(){

  System.out.println("We are in Parent class");
  }

}

class Child extends Parent{

  void display(){         //MethodOverriding
  super.display();
  System.out.println("We are in Child class");
  }

}



class MethoOverriding{

  public static void main(String[] args) {

    Child c = new Child();

    Parent p = c;
    p.display();
    c.display();
  }
}
