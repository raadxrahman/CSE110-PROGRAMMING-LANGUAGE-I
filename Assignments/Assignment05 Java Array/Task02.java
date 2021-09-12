public class Task02 {
    public static void main(String[] args) { 
        int[] marks = {10,30,20,50,40};
        int sum=10+30+20+50+40; 
        int n=5, count=0;
        int avg = sum/n;
        for (int i=0; i<marks.length; ++i) {
            if(marks[i]>avg) {
                ++count;
            }
        }
        System.out.println(count+" students batter than average.");
        System.out.println("They received following marks");
        for (int i=0; i<marks.length; ++i) {
            if(marks[i]>avg) {
                System.out.println(marks[i]);
            }
        }
    }
}
