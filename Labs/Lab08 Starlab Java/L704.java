import java.util.Scanner;
public class L704
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter line number");
        int lineNum = scanner.nextInt();
        System.out.println("Please enter column number");
        int columnNum = scanner.nextInt();
        for (int lineCount=1;lineCount<=lineNum; ++lineCount )
        { 
            for (int columnCount=1; columnCount<=columnNum; ++columnCount)
            {
                System.out.print(columnCount);
            }
        System.out.println();
        }
    }
}