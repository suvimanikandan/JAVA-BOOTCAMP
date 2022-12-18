//To calculate fibonacci series upto n numbers
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
      int n=10, firstTerm=0,SecondTerm=1;
        System.out.println("Fibonacci series till " +n + "terms:  ");
int count=0;
        for(int i=1;i<=n;i++){
            System.out.println(firstTerm + ",");

            //compute the nextterm
            int nextTerm=firstTerm+SecondTerm;
            firstTerm=SecondTerm;
            SecondTerm=nextTerm;

        }
        }
    }
