import java.util.Scanner;
public class Task30
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter starting value:");
                    int sv = scanner.nextInt();
                    System.out.println("Please enter end value:");
                    int ev = scanner.nextInt();
                    int primec=0, perfectc=0;
                    while (sv<=ev){
                              int div=1, sum=0, dc=0;
                              while (div<=sv){
                                        if (sv%div==0){
                                                  sum+=div;
                                                  dc++;
                                                  div++;
                                        }else 
                                                  div++;
                              }
                              sum=sum-sv;
                              while (sum==sv){
                                        perfectc++;
                                        sv++;
                              }if (dc==2){
                                        primec++;
                                        sv++;
                              }else{ 
                                        sv++;
                              }
                    }System.out.println(perfectc);
                     System.out.println(primec);
          }
}                  