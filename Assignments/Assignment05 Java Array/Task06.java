import java.util.Scanner;
public class Task06
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Plase Enter Number");
        int number = sc.nextInt();
        int[] a = {50,30,20,10,40};
        int highest = a[0], count=1;
        for (int i=0; i<a.length; ++i)
        {
            if(a[i]>highest)
            {
                highest = a[i];
                ++count;
            }
        }
        System.out.println("Highest mark is "+highest);
        System.out.println("Highest mark was found at location "+count);
    }
}
