// Abstract class
abstract class Animal {
    // Abstract method (no body, only idea)
    public abstract void sound();
    // Normal method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}
  // Child class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
// Another child class
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Animal d = new Dog();  // reference = Animal, object = Dog
        d.sound();
        d.sleep();

        Animal c = new Cat();
        c.sound();
        c.sleep();
    }
}
