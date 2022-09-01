import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {

        int z, x, c;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the frist Number: ");
        z = in.nextInt();

        System.out.print("Enter the scound Number: ");
        x = in.nextInt();

        System.out.print("Enter the third Number: ");
        c = in.nextInt();

        System.out.print("The average of Numbers is: ");
        double n = (z + x + c) / 3;
        System.out.println(n);


    }
}
