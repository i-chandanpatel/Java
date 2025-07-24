//Polymorphism means "many forms".
//In Java → Same method/behavior can work differently based on context.

//Compile-Time Polymorphism (METHOD OVERLOADING)

class Calculator {
    // Method 1: Add 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add 2 doubles
    double add(double a, double b) {
        return a + b;
    }
}


//Runtime Polymorphism (METHOD OVERRIDING)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks 🐶");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows 🐱");
    }
//Dynamic Method Dispatch using Upcasting
class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies low");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flies high");
    }
}

  
//Polymorphism with ABSTRACT CLASS
abstract class Shape {
    abstract double area(); // abstract method
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    double area() {
        return width * height;
    }
}


//Polymorphism with INTERFACE
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card 💳");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal 🅿️");
    }
}


public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("---- 1️⃣ Compile-time Polymorphism ----");
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));

        System.out.println("\n---- 2️⃣ Runtime Polymorphism (Method Overriding) ----");
        Animal a1 = new Animal();
        Animal a2 = new Dog(); // upcasting
        Animal a3 = new Cat(); // upcasting

        a1.sound(); // Animal version
        a2.sound(); // Dog version
        a3.sound(); // Cat version

        System.out.println("\n---- 3️⃣ Dynamic Method Dispatch ----");
        Bird bird;
        bird = new Sparrow(); // Upcast
        bird.fly(); // Sparrow version

        bird = new Eagle(); // Upcast
        bird.fly(); // Eagle version

        System.out.println("\n---- 4️⃣ Abstract Class Polymorphism ----");
        Shape s1 = new Circle(5); // Upcasting
        Shape s2 = new Rectangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());

        System.out.println("\n---- 5️⃣ Interface-based Polymorphism ----");
        Payment p1 = new CreditCardPayment(); // Upcasting
        Payment p2 = new PayPalPayment();

        p1.pay(150.0);
        p2.pay(299.99);

        System.out.println("\n✅ Polymorphism allows different implementations under a common interface!");
    }
}
