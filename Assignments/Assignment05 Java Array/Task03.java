public class Task03 {
    public static void main(String[] args) { 
        int[] a = {10,30,20,50,40};
        int highest = a[0], count=1;
        for (int i=0; i<a.length; ++i) {
            if(a[i]>highest) {
                highest = a[i];
                ++count;
            }
        }
        System.out.println("Highest mark is "+highest);
        System.out.println("Highest mark was found at location "+count);
    }
}
