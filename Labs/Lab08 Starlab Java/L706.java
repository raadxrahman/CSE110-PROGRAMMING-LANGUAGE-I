import java.util.Scanner;
public class L706
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter height number");
        int heightNum = scanner.nextInt();
        for (int heightCount=1;heightCount<=heightNum; ++heightCount )
        { 
            for (int columnCount=1; columnCount<=heightCount; ++columnCount)
            {
                System.out.print(columnCount);  
            }
            System.out.println();
        }
    }
}