class Parent {
    // Instance Method in Parent
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    // Overridden Method
    @Override
    void showMessage() {
        System.out.println("Message from Child class (Overridden)");
    }
}

public class AllMethodsDemo {
    // 1. Static Method
    static void staticMethod() {
        System.out.println("This is a STATIC method. Belongs to the class.");
    }

    // 2. Instance Method
    void instanceMethod() {
        System.out.println("This is an INSTANCE method. Belongs to the object.");
    }

    // 3. Parameterized Method
    void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome.");
    }

    // 4. Method with Return Type
    int add(int a, int b) {
        return a + b;
    }

    // 5. Overloaded Methods
    void display() {
        System.out.println("Display with no parameters");
    }

    void display(String message) {
        System.out.println("Display with a message: " + message);
    }

    // 6. Private Helper Method
    private void secret() {
        System.out.println("This is a PRIVATE method, only accessible inside this class.");
    }

    // 7. Method calling another method
    void callSecret() {
        System.out.println("Calling private method from a public one...");
        secret();
    }

    public static void main(String[] args) {

        System.out.println("=== STATIC METHOD ===");
        AllMethodsDemo.staticMethod(); // No object needed

        System.out.println("\n=== INSTANCE METHODS ===");
        AllMethodsDemo obj = new AllMethodsDemo(); // Create object
        obj.instanceMethod(); // Call instance method

        System.out.println("\n=== PARAMETERIZED METHOD ===");
        obj.greet("Denver");

        System.out.println("\n=== METHOD WITH RETURN TYPE ===");
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);

        System.out.println("\n=== METHOD OVERLOADING ===");
        obj.display();
        obj.display("Overloading in action!");

        System.out.println("\n=== PRIVATE METHOD ACCESS ===");
        obj.callSecret(); // Calls private method internally

        System.out.println("\n=== METHOD OVERRIDING (INHERITANCE) ===");
        Parent p = new Parent();
        p.showMessage(); // Parent version

        Child c = new Child();
        c.showMessage(); // Child version

        Parent poly = new Child(); 
        poly.showMessage(); // Runtime polymorphism -> Child version
    }
}
