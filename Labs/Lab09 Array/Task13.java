import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int i, evenSum=0, oddSum=0, divSum=0;
        for(i=0; i<a.length; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=scanner.nextInt();
        }
        for(i=0; i<a.length; ++i) {
            if(a[i]%2==0){
                evenSum+=a[i];
            }
            if(a[i]%2!=0){
                oddSum+=a[i];
            }
            if(a[i]%5==0){
                divSum+=a[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(divSum);
    }
}
