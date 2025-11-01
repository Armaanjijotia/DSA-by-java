//CLASS AND OBJECT 

class Car {
    String brand;
    int year;

    void start() {
        System.out.println(this.brand);
        System.out.println(this.year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();  // OBJECT
        c1.brand = "Tesla";
        c1.year = 2024;
        c1.start();
    }
}

    

