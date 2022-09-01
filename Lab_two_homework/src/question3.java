import java.util.Scanner;

public class question3 {

    public static void main(String[] args){

        double z,x;


        Scanner in= new Scanner(System.in);
        System.out.print("Enter rectangle length: ");
        z= in.nextInt();

        System.out.print("Enter rectangle width: ");
        x= in.nextInt();

        System.out.print(" Rectangle area is: ");
        double n=z*x;
        System.out.println(n);
        System.out.print(" Rectangle perimeter is: ");
        double m=2*z*x;
        System.out.println(m);

    }



}
