class Shapes{

  int r;
  int l , b;
  final float PI = 3.14f;
  float area;

  Shapes(int r){
    this.r = r;
  }

  Shapes(int l , int b){
    this.l = l;
    this.b = b;
  }

  float calArea(int r){
    area = PI * r * r;
    return area;
  }

  float calArea(int l){
    area = l * l;
    return area;
  }

}


class MethodOverloading{

  public static void main(String[] args) {

    Shapes cir = new Shapes(5);
    float area = cir.calArea(cir.r);
    System.out.println("Area of Circle = "+area);

    Shapes rec = new Shapes(6,8);
    area = cir.calArea(rec.l,rec.b);
    System.out.println("Area of Rectangle = "+area);
  }
}
