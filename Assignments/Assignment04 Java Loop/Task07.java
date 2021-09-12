public class Task07
{
          public static void main (String[] args)
          {
                    int c = 1 ; int sum = 0 ;
                    while ( c<=600 ){
                              if
                                        (c % 7 == 0 && c % 9 == 0){
                                        sum = sum + c ;
                                        c ++ ;
                              }else{
                                        c ++ ;
                              }
                    }
                    System.out.println(sum) ;
          }
}

