import java.util.Scanner;
public class Task20
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int digit = 0;
                    while ( n/10!=0 ){ 
                              digit = n%10;        
                              System.out.println ( digit );
                              n = n/10 ;
                    } 
                    digit = n % 10;
                    System.out.println(digit);
          }         
}
