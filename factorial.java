public class factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! = 1
        }
        return n * fact(n - 1); // Recursive case
    }
    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
