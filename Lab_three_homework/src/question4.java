
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b;
        System.out.println("Input number: ");

         b= in.next();
         if (b=="-")
             System.out.println("Digits of number is:"+(b.length()-1));
         else
        System.out.println("Digits of number is:"+b.length());

    }
}
