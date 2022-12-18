//Q:  Input currency in rupees as input and output in usd

import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the ruppees : ");
        float rupees=in.nextFloat();
        float dollars=0;
        dollars = rupees / 64;

        System.out.println("INR  value to USD:"  +dollars);
}
}
