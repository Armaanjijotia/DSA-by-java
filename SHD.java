public class SHD {

    public static void towerOfHanooi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Disk transfer " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanooi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanooi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanooi(n, "S", "H", "D");
    }
}
