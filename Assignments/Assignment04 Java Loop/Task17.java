public class Task17
{
          public static void main (String[] args)
          {
                    int x = 0 ; int y = 1 ; int sum = x + y ;
                    System.out.println( x );
                    System.out.println( y );
                    while ( sum < 1600 ){ 
                              System.out.println(sum);
                              x=y;
                              y=sum;
                              sum=x+y;
                    }
          }
          
}
