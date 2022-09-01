import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a month: ");
        int z=in.nextInt();
        if (z==1)
            System.out.println("Number of days in January are: 31");

        else if (z==2)
            System.out.println("Number of days in February are: 29 or 28 days");

        else if (z==3)
            System.out.println("Number of days in March are: 31 days");

        else if (z==4)
            System.out.println("Number of days in April are: 30 days");

        else if (z==5)
            System.out.println("Number of days in May are: 31 days");

        else if (z==6)
            System.out.println("Number of days in June are: 30 days");

        else if (z==7)
            System.out.println("Number of days in July are: 31 days");

        else if (z==8)
            System.out.println("Number of days in August are: 31 days");

        else if (z==9)
            System.out.println("Number of days in September are: 30 days");

        else if (z==10)
            System.out.println("Number of days in October are: 31 days");

        else if (z==11)
            System.out.println("Number of days in November are: 30 days");

        else if (z==12)
            System.out.println("Number of days in December are: 31 days");

        else
            System.out.println("This is not number month!");
    }
}
