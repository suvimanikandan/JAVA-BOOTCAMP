//Q: Take name as input and print a greeting mesage for that a particular message
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = in.next();

        System.out.println("hello " + name);
    }
}
