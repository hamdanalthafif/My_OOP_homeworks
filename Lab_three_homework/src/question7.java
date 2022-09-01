import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int z,x,c;
        System.out.print("Enter the first number: ");
        z=in.nextInt();

        System.out.print("Enter the second number: ");
        x=in.nextInt();

        System.out.print("Enter the third number: ");
        c=in.nextInt();

        if (x+1==z && c+2==z  )
            System.out.println("In order");
        else if (x-1==z && c-2==z )
            System.out.println("In order");
        else if (1+x!=z || c+2!=z )
            System.out.println("Not in order");
    }
}
