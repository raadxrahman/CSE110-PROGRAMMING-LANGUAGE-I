import java.util.Scanner;
public class L711
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            int spaceCount=1;
            for(; spaceCount<=height-lineCount; ++spaceCount)
            {
                System.out.print(" ");
            }
            for(int columnCount=spaceCount; columnCount<=height; ++columnCount)
            {
              System.out.print(columnCount);
            }
            System.out.println();
        }
    }
}