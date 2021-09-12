import java.util.Scanner;
public class L707
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int space=height;
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            for(int spaceCount=1; spaceCount<=space-1; ++spaceCount)
            {
                System.out.print(" ");
            }
            for(int starCount=1; starCount<=lineCount; ++starCount)
            {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}