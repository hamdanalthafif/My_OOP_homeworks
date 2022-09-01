import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {

        int z, x, c,v;
                                                           //swap between variables

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the frist variable: ");
        z = in.nextInt();

        System.out.print("Enter the secound variable: ");
        x = in.nextInt();

        c = x;
        x = z;

        System.out.print(" The frist variable after swap is: ");
        System.out.println(c);

        System.out.print(" The secound variable after swap is: ");
        System.out.println(x);




    }
}
