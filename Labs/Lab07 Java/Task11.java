public class Task11
{
    public static void main(String[] args) 
    { 
        int c = 40;
        while(c<=50){
            int divC=0, div=1;
            while(div<=c){
                if(c%div==0){
                    divC++;}
                div++;}
            if(divC==2){
                System.out.println(c);} 
            ++c;   
        }
    }
}
