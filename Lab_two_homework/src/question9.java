import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {

        int z, x;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        z = in.nextInt();
        System.out.print("Enter the second Number: ");
        x = in.nextInt();
        System.out.print("Sum of numbers is: ");
        System.out.println(z + x);
        System.out.print("Difference of numbers is: ");
        System.out.println(x - z);
        System.out.print("Product of numbers is: ");
        System.out.println(z * x);
        System.out.print("Average of numbers is: ");
        System.out.println((z + x) / 2);
        System.out.print("Distance of numbers is: ");
        System.out.println(z-x);
        System.out.print("Maximum of numbers is: ");
        if (z > x)
            System.out.println(z);
        else
            System.out.println(x);

        System.out.print("Minimum of numbers is: ");
        if (z < x)
            System.out.println(z);
        else
            System.out.println(x);

        System.out.println("Maximum of numbers by Math.max is: "+ Math.max(z,x));

        System.out.println("Minimum of numbers by Math.min is: "+Math.min(z,x));
    }
}
