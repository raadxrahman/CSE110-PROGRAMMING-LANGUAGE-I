import java.util.Scanner;
public class Task12
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int c=1 ;
                    double avg = 0, countA=0, sum=0 ; 
                    while (c<=10){
                              System.out.println("Please enter number");
                              int num = scanner.nextInt();
                              if
                                        (num%4==0){
                                        sum += num ;
                                        countA ++ ;         
                                        c ++ ;
                              }else{
                                        c ++ ;
                              }
                              avg = (double)sum/countA ;
                    } 
                    System.out.println (sum);
                    System.out.println (avg);
          }
}          