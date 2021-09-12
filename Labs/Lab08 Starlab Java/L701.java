import java.util.Scanner;
public class L701
{
    public static void main(String[] args)
    { 
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter number");
        int num = scanner.nextInt();
        int count=1;
        while(count<=num)
        {
            System.out.print(count);
            ++count;
        }
        System.out.println(); 
    }      
}
