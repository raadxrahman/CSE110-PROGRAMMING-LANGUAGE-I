//Take a number from user and print its absolute value. If user gives minus five, print positive five. If user gives positive five, print positive five. No need to print plus sign.

import java.util.Scanner;
public class Task14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Value: ");
        int value = sc.nextInt();
        if (value < 0){
            System.out.println(value=(-value));
        }else{
            System.out.println(value);
        }
    }
}