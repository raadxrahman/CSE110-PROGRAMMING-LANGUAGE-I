//Write javacode of a program that finds the number of hours, minutes, and seconds in a given number of seconds

import java.util.Scanner;
public class Task05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        int remainder, number, seconds, minutes, hours;
        System.out.println("Please Enter Seconds: ");
        number = sc.nextInt();
        hours = number / 3600 ;
        remainder = number % 3600 ; 
        minutes = remainder / 60 ;
        seconds = remainder % 60 ;
        System.out.println(hours+" hour");
        System.out.println(minutes+" minute");
        System.out.println(seconds+" second");
    }
}