import java.util.Scanner;

public class question6 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int z,x,c;
        System.out.print("Enter the first number: ");
        z=in.nextInt();
        System.out.print("Enter the second number: ");
        x=in.nextInt();
        System.out.print("Enter the third number: ");
        c=in.nextInt();
        if (z<x && x<c  )
            System.out.println("Increasing");
        else if (z>x && x>c )
            System.out.println("Decreasing");
        else if (z<x || z>c || c<x || x<c)
            System.out.println("Neither");
    }
}

