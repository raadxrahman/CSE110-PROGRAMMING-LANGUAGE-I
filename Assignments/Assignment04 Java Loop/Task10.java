import java.util.Scanner;
public class Task10
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int c=1 ;
                    double avg = 0 , oddcount=0, sum=0 ; 
                    while (c<=10){
                              System.out.println("Please enter number");
                              int num = scanner.nextInt();
                              if
                                        (num%2==0){
                                        c ++ ;
                              }else{
                                        sum += num ;
                                        oddcount ++ ;
                                        c ++ ;
                              }
                              avg = (double)sum/oddcount ;
                    } 
                    System.out.println (sum);
                    System.out.println (avg);
          }
}                    
                    