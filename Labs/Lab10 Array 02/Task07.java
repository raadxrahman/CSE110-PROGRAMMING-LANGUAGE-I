import java.util.Scanner;
public class Task07 {
          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    int[] a = new int[10];
                    int i, j, temp;
                    for (i = 0; i < a.length; ++i) {
                              System.out.println("Please Enter Number:");
                              a[i]=scanner.nextInt();
                    }
                    for (i = 0; i < a.length; ++i) {
                              for (j = i + 1; j < a.length; ++j) {
                                        if (a[i] < a[j]) {
                                                  temp = a[i];
                                                  a[i] = a[j];
                                                  a[j] = temp;
                                        }
                              }
                    }
                    for (i = 0; i < a.length; ++i) {
                              if (a[i]%2==0){
                                        System.out.print(a[i] + ",");
                              }
                    }
                    for (i = 0; i < a.length; ++i) {
                              System.out.print(a[i] + ",");
                              System.out.println();
                    }
          }
}