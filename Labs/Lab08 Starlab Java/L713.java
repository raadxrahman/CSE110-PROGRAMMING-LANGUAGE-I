import java.util.Scanner;
public class L713
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columnline=1, space=height;
        for(int lineCount=1; lineCount<=height+(height-1); ++lineCount)
        {
            for(int columnCount=space-1; columnCount>=1; --columnCount){
                System.out.print(" ");
            }
            for(int columnCount=1; columnCount<=columnline; ++columnCount){
                System.out.print(columnCount);
            }
            System.out.println();
            if(lineCount<height){
                columnline+=2;
                --space;}
            else{
                columnline-=2;
                ++space;}
        }
    }
}