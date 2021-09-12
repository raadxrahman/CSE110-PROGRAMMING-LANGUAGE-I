import java.util.Scanner;
public class Task10 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[10];
    int i,j;
    for(i=0; i<a.length; ++i) {
      System.out.println("Please Enter Number:");
      a[i]=scanner.nextInt();
      for (j=0; j<=i; ++j){
        System.out.println(a[j]+",");
      }
    }
  }
}
