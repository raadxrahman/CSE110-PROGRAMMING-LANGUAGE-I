import java.util.Scanner;
public class Task29
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int sum = 0 , c=1 ;
                    while ( c<n ){ 
                              if (n%c==0){
                                        sum += c;
                                        c ++;
                              }else{ 
                                        c ++ ;
                              }         
                    }         if (sum==n){
                              System.out.println("Perfect");
                    }else
                              System.out.println("Not perfect");
          }
}