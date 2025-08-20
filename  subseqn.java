class subseqn{
    public static void Subseqn(String str, int idx, String newString){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        //to be
        Subseqn(str, idx+1, newString+currchar);

        // not to be
        Subseqn(str, idx+1, newString);
    }
    public static void main(String[] args) {
    
        String str = "abc";
        Subseqn(str, 0, "");
    }
}