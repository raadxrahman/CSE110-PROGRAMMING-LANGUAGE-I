public class Task05 {
    public static void main(String[] args) { 
        int[] a = {50,30,20,10,40};
        int highest = a[1];
        int location=0;
        for (int count=1; count<a.length; ++count) {
            if(a[count]>highest) {
                highest = a[count];
                location = count;
            }
        }
        int temp = a[1];
        a[1] = highest;
        a[location] = temp;
        for (int i=0; i<a.length; ++i) {
            System.out.print(a[i]+",");
        }
    }
}
