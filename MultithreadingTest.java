 class OddNumbers extends Thread{

  public void run(){

    for(int i = 1; i<=10;i+=2){

      System.out.println("T1: "+i);
      try{
      Thread.sleep(1000);
    }
    catch(Exception e){

    }

    }

  }
}

 class EvenNumbers extends Thread{

  public void run(){

    for(int i = 0; i<=10;i+=2){
      System.out.println("T2: "+i);
      try{
      Thread.sleep(1000);
    }
    catch(Exception e){

    }

    }

  }
}




public class MultithreadingTest{

  public static void main(String[] args) {
    OddNumbers on = new OddNumbers();
    Thread t1 = new Thread(on);

    EvenNumbers en = new EvenNumbers();
    Thread t2 = new Thread(en);

    t2.start();
    t1.start();

  }

}
