public class Reverse{
    public static void printrev(String str){
    if(str.isEmpty()){
    
        return;
    }
    System.out.print(str.charAt(str.length()-1));
    printrev(str.substring(0,str.length()-1));

        
    }
    public static void main(String[] args) {
        String str=" hello ";
        printrev(str);
    }
}