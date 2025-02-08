package Day1.problems;

interface  shape{
    int calcArea();
    void print();


}

class Circle implements shape{
    int r;
    Circle(int r){
        this.r = r;
    }

    public int calcArea(){
        return (int) (3.14*r*r);
    }

    public  void print(){
        System.out.println("inside the circle");
    }
}

class  rectangle implements  shape{
    int l ,b;

    rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public int calcArea() {
        return (int)(l*b);
    }

    @Override
    public void print() {
        System.out.println("Inside the rectangle");
    }
}


public class Exercise2 {
    public static void main(String[] args){
        shape cir =new Circle(5);
        System.out.println(cir.calcArea());
        cir.print();
        shape rec = new rectangle(5,4);
        System.out.println(rec.calcArea());
        rec.print();
    }
}
