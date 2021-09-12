import java.util.Scanner;
public class Task26
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int factors = 0 , c=1 ;
                    while ( c<=n ){ 
                              if (n%c==0){
                                        factors ++;
                                        c ++;
                              }else{ 
                                        c ++ ;
                              }         
                    }
                    if (factors==2)
                              System.out.println("Prime number");
                    else
                              System.out.println("Not prime");
          }
}