import java.util.Scanner;
public class L703
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter line number");
        int rowNum = scanner.nextInt();
        System.out.println("Please enter star number");
        int columnNum = scanner.nextInt();
        for (int lineCount=1;lineCount<=rowNum; ++lineCount )
        { 
            for (int starCount=1; starCount<=columnNum; ++starCount)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
