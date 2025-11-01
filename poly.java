class MathUtil {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class poly{
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println(m.add(5, 3));     // int
        System.out.println(m.add(2.5, 4.2)); // double
    }
}
