package Day1;


interface Myinter {
    void display();  // Abstract method (no default)
}

// Class implementing Myinter
class A implements Myinter {
    @Override
    public void display() {
        System.out.println("from a");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an instance of A and calling display
        Myinter a1 = new A();
        a1.display();  // Output: from a

        // Anonymous class implementation
        Myinter a2 = new Myinter() {
            @Override
            public void display() {
                System.out.println("from the a2");
            }
        };
        a2.display();  // Output: from the a2

        // Lambda Expression
        Myinter a3 = () -> {
            System.out.println("from the a3");
        };
        a3.display();  // Output: from the a3
    }
}
