import java.util.Scanner;
public class Task07
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int c=1, num1, num2;
        System.out.println("Plase Enter Quantity:");
        int quantity=sc.nextInt();
        System.out.println("Plase Enter Value:");
        num1=sc.nextInt();
        int sum=num1, max=num1, min=num1;
        while(c<=quantity)
        {
            System.out.println("Plase Enter Value:");
            num2=sc.nextInt();
            if(num2>max){
                max=num2;}
            else if(num2<min){
                min=num2;}
            sum+=num2;
            ++c;
        }
        double avg = (double)sum/c; 
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
        System.out.println("Average:"+avg);
    }
}
