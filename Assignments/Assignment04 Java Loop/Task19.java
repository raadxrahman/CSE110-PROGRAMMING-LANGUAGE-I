import java.util.Scanner;
public class Task19
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int c = 1 , product = 1 ;
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    while ( c<=n ){ 
                              product = product * 10;        
                              c ++ ;  
                    } 
                    System.out.println( product );         
          }
} 