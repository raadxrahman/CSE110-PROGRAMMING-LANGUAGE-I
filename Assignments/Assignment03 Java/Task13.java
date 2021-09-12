import java.util.Scanner;
public class Task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        int a, b, c, d, temp;
        System.out.println("Please Enter 1st Value: ");
        a = sc.nextInt();
        System.out.println("Please Enter 2nd Value: ");
        b = sc.nextInt();
        System.out.println("Please Enter 3rd Value: ");
        c = sc.nextInt();
        System.out.println("Please Enter 4th Value: ");
        d = sc.nextInt();
        temp = d;
        d = c;
        c = b;
        b = a;
        a = temp;
        System.out.println("1st Value: "+a);
        System.out.println("2nd Value: "+b);
        System.out.println("3rd Value: "+c);
        System.out.println("4th Value: "+d);
    }
}