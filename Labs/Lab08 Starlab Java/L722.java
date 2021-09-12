import java.util.Scanner;
public class L722 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columnLimit=1, space=height;
        for(int lineCount=1; lineCount<=2*height-1; ++lineCount)
        {
          for (int columnCount=1; columnCount<=space; --columnCount){
            if (columnCount==1 || coulumnCount==columnLimit){
              System.out.print("*")
            {
                System.out.print(" ");
            }
            for(int columnCount=1; columnCount<=columnLimit; ++columnCount)
            {
                System.out.print("*");
            }
            System.out.println();
            if(lineCount<height){
                columnLimit+=2;
                --space;}
            else{
                columnLimit-=2;
                ++space;}
        }
    }
}