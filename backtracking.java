public class backtracking {
    public static void print(String str, String perm,int idx) {
        // Base case: if string is empty, print the permutation
        if(idx==str.length()){
            System.out.println(perm);
            return;
        }

        // Recurse for each character in the string
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            //(0,1)->sub means 0th letter and i letter should not be print and else everthing will print 
            //(i+1)->if i=1 then substring(2) then it skip 1st and 2nd letter only print from 3rd postion to forward 


            print(newStr, perm + currChar,idx);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        print(str, "",0);
    }
}
