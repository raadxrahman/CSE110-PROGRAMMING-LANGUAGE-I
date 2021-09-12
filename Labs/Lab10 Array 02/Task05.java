import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int i, j, temp;
        for (i = 0; i < num.length; ++i) {
            System.out.println("Please Enter Number:");
            num[i]=scanner.nextInt();
        }
            for (i = 0; i < num.length; ++i) {
                for (j = i + 1; j < num.length; ++j) {
                    if (num[i] > num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            for (i = 0; i < num.length; ++i) {
                System.out.print(num[i] + ",");
            }
            System.out.println();
        }
    }