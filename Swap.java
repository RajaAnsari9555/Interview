import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your First Number :");
       int a = sc.nextInt();
       System.out.println("Enter you second Number:");
       int b = sc.nextInt();
        System.out.println("before swapping"+ "a = " + a +"b =" +b);
       a=a^b;
       b=a^b;
       a=a^b;
         System.out.println("after swapping"+ "a = " + a +"b =" +b);
    }
}