import java.util.Scanner;
public class Task05
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter value of N");
                    int n = scanner.nextInt();
                    int c = 1 ; int y = 0 ;
                    while ( c < n ){ 
                              y = y + ( c * c * c );
                              c ++ ;  
                    } 
                    System.out.println( y );         
          }
}         