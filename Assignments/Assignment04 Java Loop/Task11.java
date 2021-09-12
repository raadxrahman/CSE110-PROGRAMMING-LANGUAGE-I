import java.util.Scanner;
public class Task11
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int c=1 ;
                    double avg = 0 , evencount=0, sum=0 ; 
                    while (c<=10){
                              System.out.println("Please enter number");
                              int num = scanner.nextInt();
                              if
                                        (num%2!=0){
                                        c ++ ;
                              }else{
                                        sum += num ;
                                        evencount ++ ;
                                        c ++ ;
                              }
                              avg = (double)sum/evencount ;
                    } 
                    System.out.println (sum);
                    System.out.println (avg);
          }
}          