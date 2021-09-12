import java.util.Scanner;
public class L718
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        for(int lineCount=1; lineCount<=height; ++lineCount)
        {
          for(int spaceCount=1; spaceCount<=height-lineCount; ++spaceCount){
            System.out.print(" ");}
            for(int starCount=1; starCount<=height; ++starCount)
            {
                if(starCount==1 || lineCount==height || lineCount==starCount)
                {
                    System.out.print("*");
                }
                else{
                  System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
