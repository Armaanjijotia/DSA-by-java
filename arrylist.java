import java.util.ArrayList;
import java.util.Collections;
public class arrylist {
    public static void main(String[] args) {
    
    ArrayList<Integer> list01 =new ArrayList<Integer>();
// add the element 
    list01.add(1);
    list01.add(2);
    list01.add(3);
    System.out.println(list01);
//get the element at that index
    int element = list01.get(1);
    System.out.println(element);
// add the element in between 
    list01.add(1, 15);
    System.out.println(list01);
// set the element at indx and remove the original idx element
    list01.set(1, 5);
    System.out.println(list01);
// remove the number in the gieven idx
   list01.remove(0);
    System.out.println(list01);
// printinge size of the list 
    int size = list01.size();
    System.out.println(size);
// sorting the list 
     Collections.sort(list01);
     System.out.println(list01);
}
}