//Assume there are two variables a and b. Take values of these variables from the user

import java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        int a, b, temp;
        System.out.println("Please Enter 1st Value: ");
        a = sc.nextInt();
        System.out.println("Please Enter 2nd Value: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("1st Value: "+a);
        System.out.println("2nd Value: "+b);
    }
}