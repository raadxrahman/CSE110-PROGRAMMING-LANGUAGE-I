public class Task09
{
          public static void main (String[] args)
          {
                    int sum=0, c=1;
                    while (c<=600){
                              if (c%7==0 && c%9==0){
                                        c ++ ;
                              }else if (c%7==0 || c%9==0){
                                        sum = sum + c;
                                        c ++ ;
                              }else if (c%7!=0 && c%9!=0){
                                        c ++ ;
                              }
                    }System.out.println(sum);
          }
}
