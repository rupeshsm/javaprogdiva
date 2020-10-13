
import java.util.Scanner;
class Numbers{

  int num[];

   void createArray( int l ){
     num = new int[l];
     System.out.println("Array Created");
   }

   void inputArray(){

     Scanner sc = new Scanner(System.in);
     for(int i = 0; i < num.length; i++){
       System.out.println("Enter the marks in the Array");
       num[i] = sc.nextInt();
     }

   }

   void displayArray(int arr[]){
     //System.out.println("Marks Stored in Array");
     for(int i =0; i < arr.length; i++){
       System.out.println("num["+i+"] = "+ arr[i]);

   }
}

  void bubbleSort(){

    int temp, i ,j;

    for(j = 0; j < num.length; j++){


      for(i = 0; i < num.length - 1; i++){

        if(num[i] > num[i+1]){

          temp = num[i];
          num[i] = num[i+1];
          num[i+1] = temp;
        }
      }
    }
  }


  int[] copyArray(){
    int temp[] = new int[num.length];
    for(int i = 0; i < num.length; i++ ){
      temp[i] = num[i];
    }

    return temp;
  }


  void modifyArray(int [] temp , int m){

    for(int i = 0; i < temp.length; i++)
      temp[i] += m;
  }

}
class ArrayTest{
  public static void main(String[] args) {

    Numbers n = new Numbers();
    n.createArray(5);
    n.inputArray();
    n.bubbleSort();

    int test[] = n.copyArray();

    System.out.println("Values from test array");
    n.displayArray(test);
    System.out.println("Values from num array");
    n.displayArray(n.num);

    int t[] = {1,4,6,7,9,34};
    int m = 10;
    n.modifyArray(t, m);
    for(int i = 0; i < t.length; i++)
      System.out.println("t[ "+i+" ] = "+ t[i]);



  }
}
