//A leading newspaper pays all their freelance writers at a rate of Tk. 500 per published article. Write javacode of a program that will read the number of published articles for one writer, and print the total monthly fees for that writer.

import java.util.Scanner;
public class Task08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Articles Number: ");
        int number = sc.nextInt();
        int fees = number*500;
        System.out.println(fees);
        
    }
}