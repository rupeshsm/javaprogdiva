class StringTest{
  public static void main(String[] args) {


    char chars[]={'R','u','p','e','s','h'};
    String s = new String(chars);
    s = s.concat(" Mishra");
    String s1 = new String(s);
    if(s1.equals(s)){
      System.out.println("Equal");
    }
    else{
      System.out.println(" Not Equal");
    }

    System.out.println("My Name is "+s.startsWith("R"));
  }
}
