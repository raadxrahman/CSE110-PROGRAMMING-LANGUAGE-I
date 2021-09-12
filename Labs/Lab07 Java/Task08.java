import java.util.Scanner;
public class Task08
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int div = 1 , divc=0 ;
                    while ( div<=n ){ 
                              if (n%div==0){
                                        divc ++;
                                        div ++ ;
                              }else{ 
                                        div ++ ;
                              }         
                    }System.out.println(divc);
          }
}