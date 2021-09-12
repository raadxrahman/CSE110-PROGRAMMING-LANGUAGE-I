import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int i;
        for(i=0; i<a.length; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=scanner.nextInt();
        }
        for(i=a.length-1; i>=0; --i) {
            System.out.println(a[i]);
        }
    }
}
