import java.util.Scanner;
public class Task09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        double x, y, z;
        System.out.println("Please Enter 1st Value: ");
        x = sc.nextInt();
        System.out.println("Please Enter 2nd Value: ");
        y = sc.nextInt();
        System.out.println("Please Enter 3rd Value: ");
        z = sc.nextInt();
        if( x > y && x >= z){
            System.out.println(x);}
        else if (y > x && y > z){
            System.out.println(y);}
        else{
            System.out.println(z);}
    }
}