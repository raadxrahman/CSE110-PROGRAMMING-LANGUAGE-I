public class Task04 {
    public static void main(String[] args) { 
        int[] a = {10,30,20,50,40};
        int highest = a[0];
        int backup = a[0];
        for (int i=0; i<a.length; ++i) {
            if(a[i]>highest) {
                highest = a[i];
            }
        }
        for (int i=0; i<a.length; ++i) {
            if(a[i]==highest) {
                a[i]=backup;
            }
            a[0] = highest;
            System.out.print(a[i]+",");
        }
    }
}
