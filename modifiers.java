class Person {
    public String name = "Armaan";       // public → accessible everywhere
    private int age = 21;                // private → only inside this class
    protected String city = "Delhi";     // protected → same package + subclasses
    String country = "India";            // default → only same package

    // Public method to access private variable
    public int getAge() {
        return age;
    }
}
public class modifiers {
    public static void main(String[] args) {
        Person p = new Person();

        // ✅ public → accessible
        System.out.println("Name: " + p.name);

        // ❌ private → not directly accessible
        // System.out.println(p.age);   // ERROR
        System.out.println("Age: " + p.getAge());  // ✅ accessed through method

        // ✅ protected → accessible in same package
        System.out.println("City: " + p.city);

        // ✅ default → accessible in same package
        System.out.println("Country: " + p.country);
    }
}
