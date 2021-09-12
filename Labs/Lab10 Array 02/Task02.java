import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please Enter Number:");
        num[0]=scanner.nextInt();
        int i, largest;
        int largeloc=0 ;
        largest= num[0];
        for(i=1; i<num.length; ++i) {
            System.out.println("Please Enter Number:");
            num[i]=scanner.nextInt();
            if (num[i]>largest){
                largest=num[i];
                largeloc = i ;
            }
        }
        System.out.println("largest number " + largest +" was found at location " + largeloc); 
    }
}

