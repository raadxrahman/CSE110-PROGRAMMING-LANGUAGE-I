import java.util.Scanner;
public class L721
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columnCount=1;
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            for(int numCount=1; numCount<=height-lineCount; ++numCount)
            {
                System.out.print(" ");
            }
            for(int numCount=1; numCount<=columnCount; ++numCount)
            {
              if (lineCount==height || numCount==1 || numCount==(2*lineCount-1)){
                System.out.print(numCount);}
              else{
                System.out.print(" ");}    
            }
            System.out.println();
            columnCount+=2;
        }
    }
}