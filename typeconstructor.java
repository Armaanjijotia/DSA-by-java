class Student {
    String name;
    int age;
    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }
    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}
public class typeconstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Armaan", 21);
        Student s2 = new Student(s1); // copy constructor
        System.out.println(s2.name + " " + s2.age);
    }
}
