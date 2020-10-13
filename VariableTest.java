import java.util.*;

class VariableTest{

  public static void main(String[] args) {
    String str;
    char ch;
    int i;
    float f;
    double d;
    boolean bool;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String Value");
    str = sc.nextLine();
    System.out.println("Enter a char Value");
    ch = (char)sc.next();
    System.out.println("Enter a int float and double Value");
    i = sc.nextInt();
    f = sc.nextFloat();
    d = sc.nextDouble();
    System.out.println("Enter a Boolean Value");
    bool = sc.nextBoolean();

    System.out.println(str + " "+ch+" "+i+" "+f+" "+d+" "+bool);
  }
}
