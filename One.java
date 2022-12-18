//Q: Write a program to print whether the number is even or odd also take the inpout user

import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num =in.nextInt();
        if(num%2==0){
            System.out.println("Its even number");
        }
        else{
            System.out.println("Its odd");
        }
    }
}
