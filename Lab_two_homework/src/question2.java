import java.util.Scanner;

public class question2 {



    public static void main(String[] args) {

        double z;


        Scanner in= new Scanner(System.in);
        System.out.print("Enter  radius of the circle: ");
        z= in.nextInt();

        System.out.print(" The area of circle is: ");
       double n=z*z*3.14;
        System.out.println(n);
        System.out.print(" The perimeter of circle is: ");
       double m=3.14*z*2;
        System.out.println(m);






    }
}
