import java.util.Scanner;
public class Task14
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number:");
                    int num = scanner.nextInt();
                    int product=1, c=1;
                    while (c <= num){
                              System.out.println("Please enter number");
                              int num2 = scanner.nextInt();          
                              product = product*num2 ;
                                        c ++ ;
                    }System.out.println( product );
          }
}

