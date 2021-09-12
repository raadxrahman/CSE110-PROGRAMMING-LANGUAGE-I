import java.util.Scanner;
public class Task04
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    int c = 1 , ec = 0 ;
                    double min = Double.POSITIVE_INFINITY ; double sum = 0.0 ;
                    while ( c <= 20){
                              System.out.println("Please enter number");
                              int n = scanner.nextInt();
                              if (n<min){
                                        min=n;
                              }if (n%2==0){
                                        ec++;
                                        sum+=n;
                              }
                              c++;
                    }
                    System.out.println(min);
                    double avg = sum/ec ;
                    System.out.println(avg);
          }
}

                              
          