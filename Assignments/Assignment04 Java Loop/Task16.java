import java.util.Scanner;
public class Task16
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number:");
                    int n = scanner.nextInt();
                    int max=n, min=n;
                    double avg = 0,sum=n , c=1 ;
                    while (c <= 9){
                              System.out.println("Please enter number:");
                              int n2 = scanner.nextInt();
                              sum += n2;
                              if (n2>max){
                                        max = n2;
                                        c ++;
                              }else if (n2>min)
                                        c ++;
                              else{
                                        min = n2;
                                        c ++;
                              }
                              avg =(double)sum/c;
                    }
                    System.out.println(max);
                    System.out.println(min);
                    System.out.println(avg);
          }
}



