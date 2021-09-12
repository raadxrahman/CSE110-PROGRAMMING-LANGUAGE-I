import java.util.Scanner;
public class Task21
{
          public static void main (String[] args)
          {
                    Scanner scanner = new Scanner (System.in);
                    System.out.println("Please enter number");
                    int n = scanner.nextInt();
                    int number=n;
                    int digit = 0;
                    while ( number/10!=0 ){ 
                              digit++;
                              number = number / 10 ;
                    }
                    int product=1 ;
                    int count=1 ;
                    while (count <= digit ){
                              product=product*10;
                              count++;
                    }
                    int num = n ;
                    while (num/product!=0){
                                        digit=num/product;
                                        System.out.println(digit);
                                        num=num%product;
                                        if (num==0)
                                        {
                                        }
                                        else
                                        {
                                                  product=product/10;
                                        }
                    }
          }
}
