import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter Quantity: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.print("Please Enter Number:");
        number[0] = sc.nextInt();
        int i, store=number[0];
        for (i = 1; i<n ; ++i) {
            System.out.print("Please Enter Number:");
            number[i] = sc.nextInt();
            if(number[i]>store) {
                store=number[i];
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}