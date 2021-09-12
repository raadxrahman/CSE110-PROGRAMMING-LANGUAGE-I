import java.util.Scanner;
public class Task02A {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        int i;
        for(i=0; i<=numbers.length-1; ++i) {
            System.out.println("Please Enter Number:");
            numbers[i]=sc.nextInt();
            if(numbers[i]>=0 && numbers[i]<=2) {
                System.out.print("a[");
                if(numbers[i]==numbers.length-1){
                    System.out.print(numbers[i]);
                } else {
                System.out.print(numbers[i]+",");
                }
                System.out.print("]");
            }
        }

    }
}
