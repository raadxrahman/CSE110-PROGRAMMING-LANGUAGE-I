import java.util.Scanner;
public class Task02 {
          public static void main(String[] args) { 
                    Scanner scanner = new Scanner(System.in);
                    int[] numbers = new int[4];
                    int i;
                    for(i=0; i<numbers.length; ++i) {
                              System.out.println("Please Enter Number:");
                              numbers[i]=scanner.nextInt();
                    }
                    System.out.println("Please enter array number: ");
                    int arraynum = scanner.nextInt();
                    System.out.println(numbers[arraynum]);
          }
}

