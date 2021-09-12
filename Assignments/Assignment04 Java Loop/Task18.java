import java.util.Scanner;
public class Task18
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int c = 0;
                    while ( n % 10 != 0 ){ 
                              n = n/10;        
                              c ++ ;  
                    } 
                    System.out.println(c);         
          }
} 