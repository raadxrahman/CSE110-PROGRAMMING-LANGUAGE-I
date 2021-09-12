//Write javacode of a program that reads a value of S and then calculates the value of L.

import java.util.Scanner;
public class Task06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        int s, l;
        System.out.println("Please Enter Value: ");
        s = sc.nextInt();
        if (s <100){
            System.out.println(l = 3000-(125*s*s));
        }else{
            System.out.println(l = 12000/(4+(s*s)/14900));
        }
    }
}