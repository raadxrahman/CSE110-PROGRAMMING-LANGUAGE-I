//Write javacode of a program for finding area of a rectangle given height and width by the user.

import java.util.Scanner;
public class Task03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Height: ");
        int height = sc.nextInt();
        System.out.println("Please Enter Width: ");
        int width = sc.nextInt();
        int area = height*width;
        System.out.println(area);
    }
}