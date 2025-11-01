// Interface (rule book)
interface Animal {
    void sound();   // method without body
    void eat();
}
// Dog implements Animal
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}
// Cat implements Animal
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: Meow Meow!");
    }
    public void eat() {
        System.out.println("Cat drinks milk.");
    }
}
public class interfacee {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        d.eat();

        Animal c = new Cat();
        c.sound();
        c.eat();
    }
}
