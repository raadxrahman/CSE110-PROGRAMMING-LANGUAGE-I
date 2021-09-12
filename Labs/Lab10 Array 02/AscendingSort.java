class AscendingSort {
          public static void main(String[] args) {
                    int[] a = {10,30,50,20,40};
                    for (int n = 0; n < a.length-1; ++n) {
                              int smallest = a[n];
                              int smallLoc = n;
                              for (int location = n+1 ; location < a.length; ++location) {
                                        if (a[location]<smallest){
                                                  smallest = a[location];
                                                  smallLoc = location; 
                                        }
                              }
                              int temp = a[n];
                              a[n] = smallest ;
                              a[smallLoc]= temp;
                    }
                    for (int location = 0; location < a.length; ++location) {
                              System.out.print(a[location] + ",");
                    }
          }
}