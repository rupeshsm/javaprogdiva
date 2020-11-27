interface Mouse{


  double PI = 3.14;  //this is by default final
  void leftClick();   // by default these methods are public and abstract
  void rightClick();



}

interface Keyboard extends Mouse{


  void showMsg(String str);
}

 class Explorer implements Mouse, Keyboard{

  int id;
  String name;

  Explorer(int id , String name){

    this.id = id;
    this.name=name;

  }

   void display(){

     //PI++;

    System.out.println("This is Explorer class"+PI);
  }

  public void leftClick(){

    System.out.println("1.Cut 2.Copy 3.Paste 4.Delete 5.SelectAll");

  }

  public void rightClick(){

    System.out.println("Move to next page");

  }

  public void showMsg(String str){

    System.out.println(str);


  }
}

 class Desktop implements Mouse, Keyboard{

  int id;
  String name;
  Desktop(int id , String name){

    this.id = id;
    this.name=name;

  }

  void display(){

    System.out.println("This is Desktop class");
  }

  public void leftClick(){

    System.out.println("1.NewFolder 2.Set BG 3.Setting");

  }

  public void rightClick(){

    System.out.println("Nothing will happen");

  }
}



public class InterfaceTest{

  public static void main(String[] args) {

    Explorer ex = new Explorer(4,"gmail.com");
    Desktop dt = new Desktop(2,"Home");

    ex.display();
    ex.leftClick();
    ex.showMsg("Keyboard Installed Sucessfully");
    dt.display();
    dt.leftClick();


  }
}
