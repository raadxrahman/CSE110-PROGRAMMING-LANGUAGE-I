import java.util.Scanner;
public class L705
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter height number");
        int heightnum = scanner.nextInt();
        for (int heightCount=1;heightCount<=heightnum; ++heightCount )
        { 
            for (int columnCount=1; columnCount<=heightCount; ++columnCount)
            {
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
