import java.util.Scanner;
public class Task06
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int c=1, num1, num2;
        System.out.println("Plase Enter Quantity:");
        num1=sc.nextInt();
        while(c<=num1)
        {
            System.out.println("Plase Enter Value:");
            num2=sc.nextInt();
            if(num2%2==0){
                System.out.println("even");}
            else{
                System.out.println("odd");}
            ++c;
        }
    }
}
