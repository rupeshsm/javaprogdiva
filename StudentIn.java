import java.io.*;
//import java.lang.*;
class StudentInfo{

  private int rollnum;
  private float marks;
  char grade;
   void setData(int rollnum, float marks){
    this.rollnum=rollnum;
    this.marks=marks;
    grade = (marks>50.0f)?'P':'F';

  }

    void getData(){

    System.out.println("My Roll No: "+rollnum);
    System.out.println("My Marks: "+marks);
    System.out.println("My Grade: "+grade);
  }

}

class StudentIn{
public static void main(String[] args)throws IOException {

  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("Enter Roll Number");
  String str  = br.readLine();

  int rollno = Integer.parseInt(str);

  System.out.println("Enter Marks");
  str  = br.readLine();
  float marks = Float.parseFloat(str);

  StudentInfo s1 = new StudentInfo();
  s1.setData(rollno,marks);
  System.out.println("Details of Student 1");
  s1.getData();


  //s1.marks = 35.6f;
  //System.out.println("My New Roll No: "+si.rollnum+si.marks);

}

}
