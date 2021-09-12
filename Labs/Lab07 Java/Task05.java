import java.util.Scanner;
public class Task05
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int c=1;
        while(c<=20)
        {
            System.out.println("Plase Enter Value");
            int number=sc.nextInt();
            if(number%2==0){
                System.out.println("even");}
            else{
                System.out.println("odd");}
            ++c;
        }
    }
}
