public class removeDuplicate {
    public static boolean  [] arry =new boolean[26];
    public static void removeD(String str,int idx,String newString){
        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(arry[currChar- 'a']){
            removeD(str, idx+1, newString);
        }
        else{
           newString = newString + currChar;


           arry[currChar - 'a']=true;
           removeD(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccddac";
        removeD(str, 0, "");
    }
}
