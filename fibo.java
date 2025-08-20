// // public class FibonacciRecursive {
// //     public static int fib(int n) {
// //         if (n == 0 || n == 1) {
// //             return n; // Base cases
// //         }
// //         return fib(n - 1) + fib(n - 2); // Recursive case
// //     }

// //     public static void main(String[] args) {
// //         int n = 10;
// //         for (int i = 0; i < n; i++) {
// //             System.out.print(fib(i) + " ");
// //         }
// //     }
// // }
 class fibo{
   public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

