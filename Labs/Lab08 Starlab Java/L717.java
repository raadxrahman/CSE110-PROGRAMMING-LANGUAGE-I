import java.util.Scanner;
public class L717
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            for(int numCount=1; numCount<=height; ++numCount)
            {
                if(numCount==1 || lineCount==height || lineCount==numCount)
                {
                    System.out.print(numCount);
                }
                else{
                  System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
