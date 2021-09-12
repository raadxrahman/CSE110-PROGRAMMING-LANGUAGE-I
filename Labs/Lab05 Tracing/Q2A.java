public class Q2A {
    public static void main(String[] args) { 
        int n=3007;
        int reverse=0;
        while (n>0) 
        {
            reverse=reverse*10+n%10;
            n/=10;
            if (reverse > n) 
            {
                System.out.println(n*reverse);
            }
            if (reverse < n) 
            {
                System.out.println(n+reverse);
            } 
            else if (n > 10) 
            {
                System.out.println(n-reverse);
            }
        }
        System.out.println(reverse);
        System.out.println(n != reverse);
        System.out.println("n="+n+reverse);
        System.out.println(reverse/10000);
        double floatingPointValue = reverse/1000;
        System.out.println(floatingPointValue);
    }
}
