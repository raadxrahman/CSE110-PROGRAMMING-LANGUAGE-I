//Write javacode of a program that reads the values for the three sides x, y, and z of a triangle, and then calculates its area.

import java.util.Scanner;
public class Task07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        double x, y, z, s, area;
        System.out.println("Please Enter 1st Value: ");
        x = sc.nextInt();
        System.out.println("Please Enter 2nd Value: ");
        y = sc.nextInt();
        System.out.println("Please Enter 3rd Value: ");
        z = sc.nextInt();
        s = (x+y+z)/2;
        area=(s*(s-x)*(s-y)*(s-z));
        System.out.println(Math.pow(area,(1.0/2)));
    }
}