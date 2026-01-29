import java.util.*;
public class majorityHasH {
    public static void majorElement(int num[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;
        for(int i=0; i<n; i++){ //true
            if(map.containsKey(num[i])){
                map.put(num[i], map.get(num[i])+1);
            }
            else{  //false
                map.put(num[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args){
        int nums[]={1,3,3,4,5,2,3,4,3};
        majorElement(nums);
    }
}
