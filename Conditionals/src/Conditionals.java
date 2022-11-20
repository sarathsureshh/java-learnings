import java.util.*;

public class Conditionals {
    public static void main(String[] args) {

        ifTriangle(checkIfTriangle());
        multiplicationTable();
        evenNumbers();
        print1to10();
        print10to1();
        squares();
        squaresOfOdd();
        squaresOfEven();

    }
    public static void ifTriangle(boolean isTrangle) {
        if (isTrangle) {
            System.out.println("Yesssss it is a TRIANGLE");
        } else
        {
            System.out.println("Ah shoot not a triangle");
        }
    }

    public static boolean checkIfTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = sc.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            return true;
        } else return false;

    }

    public static void multiplicationTable() {
        int divisor, multiplier;
        Scanner input = new Scanner(System.in);
        System.out.print("What tables you want to see? ");
        divisor = input.nextInt();
        System.out.print("How many do you want to see? ");
        multiplier = input.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            int res = i * divisor;
            System.out.println(divisor + " x " + i + " = " + res);
        }
    }
    public static void evenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void print1to10()
    {
        for(int i=1; i<=10; i++ )
        {
            System.out.println(i);
        }
    }
    public static void print10to1()
    {
        for(int i=10; i>=1; i-- )
        {
            System.out.println(i);
        }
    }

    public static void squares()
    {
        System.out.println("Printing the squares of first 10 Numbers!");
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i*i);
        }
    }

    public static void squaresOfOdd()
    {
        System.out.println("Printing the squares of first 10 Odd Numbers!");
        for(int i =0; i<=20; i++ )
        {
            if (i%2!=0)
            {
                System.out.println(i*i);
            }
        }

    }

    private static void squaresOfEven() {

        System.out.println("Printing the squares of first 10 Even Numbers!");
        for(int i =0; i<=20; i++ )
        {
            if (i%2==0)
            {
                System.out.println(i*i);
            }
        }
    }
}