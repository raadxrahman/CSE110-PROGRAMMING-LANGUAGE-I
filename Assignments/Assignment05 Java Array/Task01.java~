public class Task01 {
    public static void main(String[] args) { 
        int[] marks = {10,30,20,50,40};
        int highest = marks[0];
        int lowest = marks[0];
        int sum=0, count=0;
        for (int i=0; i<marks.length; ++i) {
            if(marks[i]>highest) {
                highest = marks[i];
            }
            else if(marks[i]<lowest) {
                lowest = marks[i];
            }
            sum+=marks[i];
            ++count;
        }
        double avg = sum/count;
        System.out.println("Highest mark is "+highest);
        System.out.println("Lowest mark is "+lowest);
        System.out.println("Average mark is "+avg);
    }
}
