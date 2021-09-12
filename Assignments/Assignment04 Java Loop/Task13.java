import java.util.Scanner;
public class Task13
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number:");
                    int num = scanner.nextInt();
                    int sum=0, c=1;
                    while (c <= num){
                              if ( c%2!=0 ){
                                        sum += c ;
                                        c ++ ;
                              }else{ 
                                        c ++ ;
                              }
                    }System.out.println( sum );
          }
}
