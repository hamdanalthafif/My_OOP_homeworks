import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int z,x,c;
        System.out.print("Enter the first number: ");
        z=in.nextInt();
        System.out.print("Enter the second number: ");
        x=in.nextInt();
        System.out.print("Enter the third number: ");
        c=in.nextInt();
        if (z==x && z==c )
            System.out.println("All the same");
        else if (z!=x && x!=c && c!=z  )
            System.out.println("All  different");
        else if (z==x || z!=c || z!=x || z==c)
            System.out.println("All the neither");
    }
}
