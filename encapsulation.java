class Student {
    // Data is hidden (private)
    private String name;
    private int age;
    // Setter (to give value)
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    // Getter (to get value)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        // Using methods to set values
        s.setName("Armaan");
        s.setAge(12);
        // Using methods to get values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
