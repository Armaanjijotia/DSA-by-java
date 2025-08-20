public class recursion1 {
    public static void printrevese(int m ){
       if(m==0){
        return;
       }
       System.out.println(m);
       printrevese(m-1);
    }
    public static void printnumber(int n ){
        if(n==6){
            return;
        }
        System.out.println(n);
          printnumber(n+1);

    }
    public static void main(String[] args) {
        int n=1;
        int m=5;
        printnumber(n);
        System.out.println("printing reverse ");
        printrevese(m);
    }
}
