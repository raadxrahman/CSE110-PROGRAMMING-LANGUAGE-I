public class Task07 {
    public static void main(String[] args) {
        int i, j, temp;
        int a[] = {50,30,20,10,40};
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
            System.out.print(a[i] + ",");
        }
    }
}