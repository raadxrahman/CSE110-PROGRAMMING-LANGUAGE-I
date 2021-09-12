import java.util.Scanner;
public class Task11 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[10];
    int i,j;
    for(i=0; i<a.length; ++i) {
      System.out.println("Please Enter Number:");
      a[i]=scanner.nextInt();
      for (j=0; j<i; ++j){
        if (a[i]==a[j]){
          System.out.println("Enter different number");
          --i;
        }
      }
    }
    for (i=0; i<=a.length; ++i){
      System.out.println(a[i]);
    }
  }
}

