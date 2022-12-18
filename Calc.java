//Q: Take in two numbers and an operator(+,-,*,/) and calculate the value (use if conditions)

import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number: ");
        System.out.println("Enter the num1: ");
        int num1=in.nextInt();
        System.out.println("Enter the num2: ");
        int num2=in.nextInt();
        System.out.println("Enter the operator: ");
        char ch=in.next().trim().charAt(0);
        int ans=0;
        if(ch=='+'){
            ans=num1+num2;
        }
        else if(ch=='-' ){
            ans=num1-num2;
        }
        else if(ch=='*'){
            ans=num1*num2;
        }
        else if (ch=='/')  {
            ans=num1/num2;
        }
        else{
            System.out.println("Please enter a valid operation!!");
        }

        System.out.println(ans);
    }

}
