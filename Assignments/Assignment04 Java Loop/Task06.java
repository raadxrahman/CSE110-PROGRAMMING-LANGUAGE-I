import java.util.Scanner;
public class Task06
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter value of N");
                    int n = scanner.nextInt();
                    int c = 1 ; int y = 0 ; int sign = 1;
                    while ( c < n ){ 
                              y = y + ( sign * c * c );
                              c ++ ;
                              sign =- sign ;
                    } 
                    System.out.println( y );         
          }
}         