class Numbers{

  int a , b;

  Numbers(int a, int b){
    this.a = a;
    this.b = b;
  }

  void getData(){
    System.out.println("a = "+a+" and b = "+b);
  }

   Numbers swapNumber(){
     Numbers n = new Numbers(b,a);
     return n;
   }
}




class SwapTest{
  public static void main(String[] args) {

    final int MAX =20;
    System.out.println("MAX= "+MAX);

    Numbers n1 = new Numbers(4,5);
    n1.getData();

    Numbers n2 = n1.swapNumber();
    n2.getData();

    Numbers n3 = n1.swapNumber();
    n2.getData();

  }
}
