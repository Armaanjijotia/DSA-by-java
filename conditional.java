import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element for a: ");
        int a = sc.nextInt();

        System.out.print("Enter the element for b: ");
        int b = sc.nextInt();

        // IF AND ELSE STATEMENT 

       if (a == b) {
           System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
     
       // SWITCH CASE 
       
       System.out.println("enter compare no.");
       int compare = sc.nextInt();
       switch (compare) {
           case 1:
           if(compare==1)
           System.out.println("print a is lesser");
               break;
            case 2:
           if(compare==2)
           System.out.println("print a is greater");
               break;
           default:
           System.out.println("no. invalid");
              
       }
    }
}
