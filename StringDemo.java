class StringDemo{
  public static void main(String[] args) {

    char chars[]={'S','E','C','M','P','N','A'};

    String s1 = new String(chars);

    s1 = s1.concat(" is Best");

    //System.out.println("Length of String "+s1.length());
    //System.out.println("Char at 6 th pos "+s1.charAt(6));
    //System.out.println("My Class is "+s1.indexOf("Best"));
    s1 = s1.replace('A','B');
    //System.out.println("My Class is "+s1);

    String s2 = new String(s1);

    String s3 = s2;

    if(s3==s2){
      //System.out.println("Equal");
    }
    else{
      //System.out.println("Not Equal");
    }

    s1 = s1.substring(0,5);
    //System.out.println("Substring "+s1);


    StringBuffer sb = new StringBuffer("SECMPN");
    int l = sb.length();
    int c = sb.capacity();
    System.out.println("Lenght = "+l + " and Capacity = "+c);
    sb.append("-A");
    System.out.println("My Class "+sb);
    sb.reverse();
    System.out.println("Rev of string "+sb);
  }
}
