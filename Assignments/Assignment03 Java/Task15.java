import java.util.Scanner;
public class Task15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Hour: ");
        int hour = sc.nextInt();
        if (hour < 24)
        {
            if (hour >= 0)
            {
                if (hour > 20){
                    System.out.println("Patience is a virtue");}
                else if (hour >= 19){
                    System.out.println("Dinner");}
                else if (hour > 17){
                    System.out.println("Patience is a virtue");}
                else if (hour >= 16){
                    System.out.println("Snacks");}
                else if (hour > 13){
                    System.out.println("Patience is a virtue");}
                else if (hour >= 12){
                    System.out.println("Lunch");}
                else if (hour > 6){
                    System.out.println("Patiene is a virtue");} 
                else if (hour >=4 ){
                    System.out.println("Breakfast");}
                else {
                    System.out.println("Patience is a virtue");}      
        }else{
            System.out.println("Wrong Time");}
    }
    
    }
}
