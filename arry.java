import java.util.*;
public class arry {
    // public static void main(String[] args) {
    //     int [] marks = new int[5];
    //      marks[0]=34;
    //      marks[1]=21;
    //      marks[2]=44;
    //      marks[3]=221;
    //      marks[4]=333;
    //   for(int i=0;i<5;i++){
    //     System.out.println(marks[i]);
    // }
    //     }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the number of students:");
    //     int numStudents = sc.nextInt();
    //     sc.nextLine(); // Consume the leftover newline

    //     String[] names = new String[numStudents];

    //     for (int i = 0; i < numStudents; i++) {
    //         System.out.println("Enter name for student " + (i + 1) + ":");
    //         names[i] = sc.nextLine();
    //     }

    //     System.out.println("Names of students:");
    //     for (int i = 0; i < numStudents; i++) {
    //         System.out.println(names[i]);
    //     }

    //     sc.close();
    // } 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String[] names = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter name for student " + (i + 1) + ":");
            names[i] = sc.nextLine();
          
        }
    
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Enter name to search:");
        String x = sc.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(x)) {
                System.out.println("Detected " + i);
                return;
            }
        }

        System.out.println("Not detected");
    }
}