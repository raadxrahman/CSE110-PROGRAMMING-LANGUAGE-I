import java.util.Scanner;
public class L720
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columnCount=1;
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
            for(int starCount=1; starCount<=height-lineCount; ++starCount)
            {
                System.out.print(" ");
            }
            for(int starCount=1; starCount<=columnCount; ++starCount)
            {
              if (lineCount==height || starCount==1 || starCount==(2*lineCount-1)){
                System.out.print("*");}
              else{
                System.out.print(" ");}    
            }
            System.out.println();
            columnCount+=2;
        }
    }
}