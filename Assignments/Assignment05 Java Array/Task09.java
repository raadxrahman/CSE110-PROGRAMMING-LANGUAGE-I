import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, n, sum=0;
        System.out.print("Please Enter Quantity: ");
        n = sc.nextInt();
        int[] id = new int[n];
        String[] name = new String[n];
        double[] mark = new double[n];
        for (i = 0; i<n ; ++i) {
            System.out.println("Please Enter ID:");
            id[i] = sc.nextInt();
            System.out.println("Please Enter Name:");
            name[i] = sc.nextLine();
            System.out.println("Please Enter Mark:");
            mark[i] = sc.nextDouble();
            sum+=mark[i];
        }
        double avg = sum/n;
        System.out.println("Average Mark: "+avg);
        for (i = 0; i<n ; ++i) {
            System.out.println(name[i]+": "+mark[i]);
        }
    }
}