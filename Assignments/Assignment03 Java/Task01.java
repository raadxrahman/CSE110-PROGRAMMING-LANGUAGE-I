//Write javacode of a program that reads a student’s mark for a single subject, and prints out “Pass” if the student got more than 50, and “You shall not pass” otherwise.

import java.util.Scanner;
public class Task01
{
          public static void main(String[] args)
          {
                    Scanner scanner = new Scanner ( System.in );
                    System.out.println("Please Enter Mark: ");
                    int mark = scanner.nextInt();
                    if (mark>=0 && mark<=100)                 
                    {
                              if (mark > 50){
                                        System.out.println("Pass");}
                              else{
                                        System.out.println("You shall not pass");}
                    }else{
                              System.out.println("Wrong");}
          }
}