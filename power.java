public class power {
    public static int powerof(int x, int n){
        if ( x == 0){
            return 0;
        }
        if (n==0) {
          return 1;
        }
    
        int xpower1 = powerof(x, n-1);
         int xpw= x*xpower1;
         return xpw;
    }
    public static void main(String[] args) {
        int x=5;
        int n=2;
        int ans = powerof(x, n);
        System.out.println(ans);
    }
}
