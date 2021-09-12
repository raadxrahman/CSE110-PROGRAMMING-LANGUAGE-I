public class Task01d
{
    public static void main(String[] args){ 
        int sign = 1 ; int c = 18;
        while(c <= 63){
            int num = c*sign;
            if(c==63){
                System.out.print(num);}
            else{System.out.print(num+",");}
            c+=9;
            sign*=(-1);
        }
    }
}
