public class Task04
{
    public static void main(String[] args)
    { 
        int c = 1, sum = 0;
        while(c<=600)
        {
            if((c%7==0 && c%9!=0)||(c%7!=0 && c%9==0))
            {
                sum+=c;
            }
            ++c;
        }
        System.out.println(sum);
    }
}
