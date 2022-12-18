//Q: Write a program to input principal time, and rate(P,T,R) from the user and find the simple interest// port java.util.Scanner;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the prinicipal value :");
        int p=in.nextInt();
        System.out.println("Enter the rate value ");
        int r=in.nextInt();
        System.out.println("Enter the time value: ");
        int t=in.nextInt();
        int A;
        A = (p  * t *r)/100;
//        A	=	final amount
//                P	=	initial principal balance
//        r	=	annual interest rate
//        t	=	time (in year

        System.out.println("the value of A is : " +  A);
    }
}
