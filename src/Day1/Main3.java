package Day1;

class Example{
    static int stavar = 0;
    int nonsta = 0;

    static{// iniatialize static block
        /*
        static block are executed before the main method
         */
        System.out.println("static block executed");
    }

    // static variable retains its value
    Example(){
        stavar++;
        nonsta++;
    }
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Example.stavar); // can be accesed by its class name but non static can't
        Example e = new Example();
        System.out.println(e.nonsta+" "+e.stavar); // 1  1
        Example ee = new Example();
        System.out.println(ee.nonsta+" "+ee.stavar); // 1 2
    }

}
