public class Task08
{
          public static void main (String[] args)
          {
                    int sum = 0 ; int c = 1 ;
                    while ( c <= 600 ){
                              if
                                        (c % 7 == 0 || c % 9 == 0){
                                        sum = sum + c ;
                                        c ++ ;
                              }else{
                                        c ++ ;
                              }
                    }
                    System.out.println(sum);
          }
}
                                        
                                        
                    