import java.io.*;



class ArithmaticOperation{

  int a;
  int b;
  float res;
  int arr[];
  ArithmaticOperation(int a, int b){
    this.a = a;
    this.b = b;
    arr = new int[a];


  }

  void div(){
    try{
      res = a/b;
      System.out.println("Result od Div = "+res);

      for(int i =0; i<=a;i++){
        arr[i]=i*2;
      }

    }
    catch(Exception ae){
      System.out.println("Second Number is zero, change it");

    }
    catch(ArrayIndexOutOfBoundsException ob){
      System.out.println("You entered more values");

    }
    finally{
      System.out.println("This line will always run");
    }

  }

}

class ExceptionDemo{

  public static void main(String[] args)throws IOException {

    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Two Numberes");

    String str = br.readLine();
    int a = Integer.parseInt(str);
    str = br.readLine();
    int b = Integer.parseInt(str);

    ArithmaticOperation ao = new ArithmaticOperation(a,b);
    ao.div();

    System.out.println("Rest of my code");

  }
}
