//Write a java program that reads two integers from the user. Your program should then print �first is greater� if the first number is greater, �second is greater� if the second number is greater, and �the numbers are equal� otherwise.

import java.util.Scanner;
public class Task7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        int x = sc.nextInt();
        System.out.println("Please Enter 2nd integer Number");
        int y= sc.nextInt();
        if ( x > y )          
            System.out.println( "first is greater" );
        if ( x < y )          
            System.out.println( "second is greater" );
        else {         
            System.out.println( "the numbers are equal" );}
    }
}