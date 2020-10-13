class StudentInfo{

  private static int total;

  private int rollnum;
  private float marks;
  String name;
  char grade;
  //boolean bool;

  static{

    System.out.println("This will run in the begening "+total);
  }




   static int checkTotal(){

     return total;
   }
  StudentInfo(String name, int rollnum){  //parameteerised Constructor

    total++;
    this.rollnum = rollnum;
    this.name = name;
    //marks = 20.0f;
    grade = 'X';
  }

   void setData(String name, int rollnum, float marks){

    this.rollnum=rollnum;
    this.marks=marks;
    this.name = name;


  }

    void getData(){

    System.out.println("Name: "+name);
    System.out.println("Roll: "+rollnum);
    System.out.println("Marks: "+marks);
    System.out.println("Grade: "+grade);
    //System.out.println("Boolean : "+bool);
  }

   char calGrade(){
     grade = (marks>50.0f)?'P':'F';
     return grade;
   }

}

class Student{
public static void main(String[] args) {

  System.out.println("Total Student "+ StudentInfo.checkTotal());
  StudentInfo s1 = new StudentInfo("Sai", 45); // declare reference to object
  s1.getData();
  System.out.println("Total Student "+ s1.checkTotal());
  //StudentInfo.total =50;
  StudentInfo s2 = new StudentInfo("Alwyn", 15);
  s2.getData();
  System.out.println("Total Student "+ s1.checkTotal());

  //int test;
  //s1.setData("Rupesh", 45,56.78f);

  //char grade = s1.calGrade();
  //StudentInfo copys1 = s1;
  //copys1.name = "Vishwa";
  //System.out.println("Details of Student s1");
   // allocate a StudentInfo object



  //System.out.println("Details of Student copy of s1");
  //copys1.getData();
  //System.out.println("int: "+test);


  //s1.marks = 35.6f;
  //System.out.println("My New Roll No: "+si.rollnum+si.marks);

}

}
