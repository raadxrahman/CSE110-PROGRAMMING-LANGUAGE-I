public class Task27
{
          public static void main (String[] args)
          {
                    int sv = 1 ; 
                    while ( sv<=1000 ){ 
                              int div = 1 ; int dc = 0 ;
                              while (div<=sv){
                                        if (sv%div==0){
                                                  dc ++;
                                                  div ++;
                                        }else{ 
                                                  div ++ ;
                                        }         
                              }
                              if (dc==2){
                                        System.out.println(sv);
                                        sv++ ;
                              }else
                                        sv++ ;
                    }
          }
}