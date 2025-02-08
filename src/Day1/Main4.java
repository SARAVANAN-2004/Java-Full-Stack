package Day1;

class Staff {
    int id;
    String name;

    public String getDetails() {
        return id + " " + name;
    }
}
class Manager extends Staff{
    String dept;
    public String getDetails(){
        return super.getDetails()+" "+dept;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Staff s1 = new Staff();
        System.out.println(s1.getDetails());
        Staff s2 = new Manager();
        System.out.println(s2.getDetails());
    }
}
