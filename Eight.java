//Q:  TO find out whether the given string is palindrome or not
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        String str="level",reverseStr=" ";
   int strLength=str.length();
        for(int i=(strLength-1);i>=0;--i){
            reverseStr=reverseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + " is a palindrome number");
        }
        else{
            System.out.println(str + " is not a palindrome number");
        }
    }

}
