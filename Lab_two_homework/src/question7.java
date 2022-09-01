
import java.util.Scanner;

public class question7 {


    public static void main(String[] args) {

        int z;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        z = in.nextInt();

        for (int i = 1; i <= z; i++) {
            if (i * i == z) {
                System.out.print("The square root is: ");
                System.out.println(i);
            } else if (i * i * i == z) {
                System.out.print("The cube root is: ");
                System.out.println(i);
            } else if (i * i * i * i == z) {
                System.out.print("The fourth root is: ");
                System.out.println(i);


            }


        }


    }

}
