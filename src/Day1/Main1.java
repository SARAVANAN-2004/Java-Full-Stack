package Day1;

class  Employee{
    int id;
    String name;
    double salary;

    Employee(){
        id = 101;
        name = "Ramesh";
        salary = 30000;
    }

    public  String toString(){
        return "id "+ id + " Name " + name + " salary " + salary;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e);
    }
}
