class Employee{
  String name;
  int eid;

  Employee(int eid, String name){

    this.name = name;
    this.eid = eid;

  }

  void display(){

    System.out.println(eid + "      "+name);
  }

  int display(){

    System.out.println(eid + "      "+name);
    return 0;
  }

  void search(){

    System.out.println("Employee ID:  "+eid + " and Name:  "+name);

  }

  void search(String name){

    System.out.println("Employee ID:  "+eid);

  }

  void search(int eid){

    System.out.println("Employee Name:  "+name);

  }


}


class ObjectArray{

  public static void main(String[] args) {

    Employee e[] = new Employee[3];
    String name[] = {"Leah","Rebecca", "Sai"};

    for(int i = 0; i < e.length; i++){
      e[i] = new Employee(i+1, name[i]);
    }

    System.out.println("Eid     Name");
    for(int i = 0 ; i < e.length; i++){
      e[i].display();
    }
    System.out.println("Search Res");

    e[2].search();

    e[1].search(e[1].name);

    e[0].search(e[0].eid);

  }
}
