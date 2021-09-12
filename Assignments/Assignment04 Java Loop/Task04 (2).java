import java.util.Scanner;
 class Task004
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Number: ");
        int number1 = sc.nextInt();
        int count=2, sum =0, min =number1, evenCount=0;
        if( number1%2==0 ){
            ++evenCount;
            sum = sum + number1;}
        while (count<=3){
            System.out.println("Please Enter Number: ");
            int number2 = sc.nextInt();
            if( min > number2 ){
                min = number2;}
            if( number2%2==0 ){
                ++evenCount;
                sum = sum + number2;}
            ++count;}
        double avg= (double)sum/evenCount;
        System.out.println("Average: "+avg);
        System.out.println("Maximum: "+min);
    }    
}
