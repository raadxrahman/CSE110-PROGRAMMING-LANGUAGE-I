import java.util.Scanner;
public class Task09 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[10];
    int i=0;
    for(i=0; i<a.length; ++i) {
      System.out.println("Please Enter Number:");
      a[i]=scanner.nextInt();
    }
    System.out.println("Please Enter Another Number:");
    int num=scanner.nextInt();
    int flag=1;
    for (i=0; i<a.length; ++i){
      if(a[i]==num){
        flag=0;
      }
    } if (flag==0){
      System.out.println("yes");
      }else {
        System.out.println("no");
          
      }
  }
}

