class Parent{

  protected int a;
  protected int b;

  Parent(int a, int b ){

    this.a = a;
    this.b = b;

  }

  protected void displayP(){

    System.out.println(a+" "+" "+b);
  }

  protected static void test(){

    System.out.println("This is static method");
  }

}


class Child1 extends Parent{
  int x;
  int y;

  Child1(int a, int b, int x, int y){
    super(a,b);    //calling constructor of Superclass  P()
    this.x = x;
    this.y = y;

  }

  protected void displayC1(){
    System.out.println(x+" "+" "+y);

  }
}

class Child2 extends Parent{

  protected int m,n;
  Child2(int a, int b, int m, int n){
    super(a,b);    //calling constructor of Superclass  P()
    this.m = m;
    this.n = n;

  }

  protected void displayC2(){
    System.out.println(m+" "+" "+n);

  }


}


class InheritanceTest{

  public static void main(String[] args) {

    Child2 c2 = new Child2(2,4,45,64);
    Child1 c1 = new Child1(34,43,89,98);
    //P p = c;
    Parent.test();
    Child2.test();
    System.out.println("Values fron Child2 "+c2.m+" "+c2.a);
    //p.displayC();
    c2.displayP();   // from parent class
    //c2.displayC1(); // from child1
    c2.displayC2(); // from child2



    System.out.println("Values fron Child1 ");
    //p.displayC();
    c1.displayP();   // from parent class
    //c2.displayC1(); // from child1
    c1.displayC1(); // from child2

  }
}
