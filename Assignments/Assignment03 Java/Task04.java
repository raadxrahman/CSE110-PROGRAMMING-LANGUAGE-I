import java.util.Scanner;
public class Task04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Payment: ");
        int payment = sc.nextInt();
        System.out.println("Please Enter Age: ");
        int age = sc.nextInt();
        double tax;
        if (age >= 18 && payment >= 10000)
        {
            if (payment <= 20000){
                System.out.println( tax=payment*(5.0/100) );}
            else{
                System.out.println( tax=payment*(10.0/100) );}
        }else{
            System.out.println("No Tax");}
    }
}