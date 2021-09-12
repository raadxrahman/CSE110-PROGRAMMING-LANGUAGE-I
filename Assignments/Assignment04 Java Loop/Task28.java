import java.util.Scanner;
public class Task28
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
                    }
                              System.out.println(sum);
          }
}