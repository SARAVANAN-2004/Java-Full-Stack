package Day1.problems;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Tamil".charAt(0));
//        String s = in.next();
//        System.out.println(s.charAt(0)+" "+s.charAt(0));
        // to swap two variable without the 3rd variable
        System.out.println("Enter a and b");
        String a = in.next();
        String b = in.next();
        System.out.println("before swapping");
        System.out.println(a+" "+b);
        a  += b;

        b = a.substring(0,a.length()-b.length());
        a = a.substring(a.length()-b.length()-1);
        System.out.println("after swapping");
        System.out.println(a+" "+b);

        // accept single digit number and convert to the three digit form
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println("00"+n);



    }
}
