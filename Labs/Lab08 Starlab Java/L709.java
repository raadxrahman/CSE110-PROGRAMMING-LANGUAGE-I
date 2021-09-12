import java.util.Scanner;
public class L709
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height");
        int height = scanner.nextInt();
        int columncount=1, spacecount=height-1;
        for(int linecount=1; linecount<=height; ++linecount)
        {
            for(int starcount=1; starcount<=spacecount; ++starcount)
            {
                System.out.print(" ");
            }
            for(int starcount=1; starcount<=columncount; ++starcount)
            {
                System.out.print("*");
            }
            System.out.println();
            columncount+=2;
            spacecount--;
        }
    }
}