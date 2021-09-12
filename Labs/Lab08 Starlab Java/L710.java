import java.util.Scanner;
public class L710
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columnCount=1, spaceCount=height-1;
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            for(int numCount=1; numCount<=spaceCount; ++numCount)
            {
                System.out.print(" ");
            }
            for(int numCount=1; numCount<=columnCount; ++numCount)
            {
                System.out.print(numCount);
            }
            System.out.println();
            columnCount+=2;
            --spaceCount;
        }
    }
}