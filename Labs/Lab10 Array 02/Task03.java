import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please Enter Number:");
        num[0]=scanner.nextInt();
        int i, largest, smallest, largeLoc, smallLoc;
        largest= num[0]; largeLoc=0;
        smallest= num[0]; smallLoc=0;
        for(i=1; i<num.length; ++i) {
            System.out.println("Please Enter Number:");
            num[i]=scanner.nextInt();
            if (num[i]>largest){
                largest=num[i];
                largeLoc=i;
            }else {
                smallest=num[i];
                smallLoc=i;
            }
        }
        System.out.println("largest number " + largest +" was found at location " +largeLoc); 
        System.out.println("smallest number " + smallest +" was found at location " +smallLoc); 
    }
}

