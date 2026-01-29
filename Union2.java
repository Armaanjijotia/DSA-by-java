import java.util.*;
public class Union2 {
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0 ; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0 ; j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4};
        int arr2[]={1,5,6,7,8,9};
        System.out.println(union(arr1, arr2));
    }
}
