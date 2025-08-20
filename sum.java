public class sum {
    // public static int sumOfN(int n) {
    //     if (n == 0) {
    //         return 0;
    //     }
    //     return (n + sumOfN(n - 1));
    // }

    // public static void main(String[] args) {
    //     int n = 5;
    //     int total = sumOfN(n);
    //     System.out.println("Sum of first " + n + " numbers is: " + total);
    // }
    public static void sumof(int i, int n, int sum){
    if(n==i){
        sum=i+1;
        System.out.println(sum);
        return;
    }        
    sum=i+1;
    sumof(i+1,n,sum);
    }
    public static void main(String[] args) {
        sumof(1,2,0);
    }
}
