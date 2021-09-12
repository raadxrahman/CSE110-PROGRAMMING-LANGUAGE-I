import java.util.Scanner;
public class Task03A
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner ( System.in );
                    System.out.println("Please enter number 1:");
                    int num1 = scanner.nextInt();
                    int sum = num1 , max = num1 , c = 1;
                    double avg = 0;
                    while ( c <= 3 ){
                              System.out.println("Please enter number 2:");
                              int num2 = scanner.nextInt();
                              if ( max < num2 ){
                                        max = num2;
                                        sum = sum + num2;
                                        c ++ ;
                              }else{
                                        c ++ ;
                              }
                    }                             
                    avg = (double) sum / c ;
                    System.out.println( max );
                    System.out.println( avg );
          }  
}