import java.util.Scanner;
public class L714
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int heigth = scanner.nextInt();
        System.out.println("Please Enter Triangle Width");
        int width = scanner.nextInt();
        for(int lineCount=1; lineCount<=heigth; ++lineCount)
        {
            for(int columnCount=1; columnCount<=width; ++columnCount)
            {
                if(lineCount==1 || columnCount==1 || lineCount==heigth || columnCount==width){
                    System.out.print("*");}
                else{
                System.out.print(" ");}
            }
            System.out.println();
        }
    }
}