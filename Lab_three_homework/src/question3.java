import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input number: ");
        int z=in.nextInt();
        if (z>0)
            System.out.println("The number "+z+ " is positive.");
        if (z==0)
            System.out.println("The number "+z+" is zero.");
        if (z<0)
            System.out.println("The number "+z+" is negative.");
    }
}
