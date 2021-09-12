import java.util.Scanner;
public class Task15
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int sum=0, c=1;
                    while (c <= 20){
                              System.out.println("Please enter number:");
                              int num = scanner.nextInt();
                              sum += num ;
                              System.out.println( sum );
                              c ++ ;
                    }
          }
}