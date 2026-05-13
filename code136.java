public class code136{
    public int singleNumber(int nums[]){

        int result =0;
        for(int num : nums){
            result=result ^ num; // 1 ^ 2 ^ 2 ^ 1 ^ 5
                   }             // (1 ^ 1) ( 2 ^ 2 ) ^ 5
        return result;           // (0) ^ (0) ^ 5 
    }                            // 5
}