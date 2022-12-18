//Q:Take 2 numbers as inp[ut and print the largest number
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1=in.nextInt();
        System.out.println("Enter the number2:");
        int num2=in.nextInt();
        if(num1>num2){
            System.out.println("The  number1 is the largest as compare of num2");
        }
        else{
            System.out.println("The Number2 is the largesrt as compare of num1");
        }
    }
}
