import java.util.Scanner;
public class L702
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter number");
        int num = scanner.nextInt();
        for (int count=1; count<=num; ++count )
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
