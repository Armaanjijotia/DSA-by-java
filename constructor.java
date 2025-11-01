class Student {
    String name;
    int age;

    // Constructor (same name as class)
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s = new Student("Armaan", 21);
        System.out.println(s.name + " " + s.age);
    }
}
