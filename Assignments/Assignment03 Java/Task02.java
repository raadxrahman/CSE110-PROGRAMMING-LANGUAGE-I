import java.util.Scanner;
public class Task02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Mark: ");
        int mark = sc.nextInt();
        if (mark <= 100 && mark >= 0)
        {
            if (mark >= 90){
                System.out.println("A");}
            else if (mark >= 80){
                System.out.println("B");}
            else if (mark >= 70){
                System.out.println("C");}
            else if (mark >= 60){
                System.out.println("D");}
            else if (mark >= 50){
                System.out.println("E");}
            else{
                System.out.println("F");}
        }else{
            System.out.println("Wrong Input");}    
    }
}
