class Parent {
    // Instance Method in Parent
    // This method will be overridden in the Child class.
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}
//Inner class can be declared within a method of an outer class which we will be illustrating in the below example where Inner is an inner class in outerMethod().
//A static class defined inside another class. It cannot access non-static members of the outer class directly. 
class Child extends Parent {
    // Overridden Method
    // The @Override annotation tells the compiler that this method
    // replaces (overrides) the Parent class's version.
    @Override
    void showMessage() {
        System.out.println("Message from Child class (Overridden)");
    }
}

public class AllMethodsDemo {    
    // 1. Static Method
    // - Belongs to the class, NOT to any specific object.
    // - Can be called using the class name directly without creating an object.
    static void staticMethod() {
        System.out.println("This is a STATIC method. Belongs to the class.");
    }

    // 2. Instance Method
    // - Belongs to an object (instance of a class).
    // - You must create an object to call it.
    void instanceMethod() {
        System.out.println("This is an INSTANCE method. Belongs to the object.");
    }

    // 3. Parameterized Method
    // - Takes arguments when you call it.
    // - Here, it takes a String name and prints a greeting.
    void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome.");
    }

    // 4. Method with Return Type
    // - Accepts two integers, returns their sum.
    // - Shows how methods can return values.
    int add(int a, int b) {
        return a + b;
    }

    // 5. Method Overloading
    // - Same method name "display" but with different parameter lists.
    // - Compiler decides which version to call based on arguments.
    void display() {
        System.out.println("Display with no parameters");
    }

    void display(String message) {
        System.out.println("Display with a message: " + message);
    }

    // 6. Private Method
    // - Accessible only inside this class.
    // - Useful for helper methods that should not be called from outside.
    private void secret() {
        System.out.println("This is a PRIVATE method, only accessible inside this class.");
    }

    // 7. Method calling another method
    // - Shows how one method can call another (even private ones).
    void callSecret() {
        System.out.println("Calling private method from a public one...");
        secret();  // calling private method internally
    }

    
    public static void main(String[] args) {

        // === STATIC METHOD ===
        // Call static method using class name (no object needed)
        System.out.println("=== STATIC METHOD ===");
        AllMethodsDemo.staticMethod();

        // === INSTANCE METHODS ===
        // Create an object to call non-static (instance) methods
        System.out.println("\n=== INSTANCE METHODS ===");
        AllMethodsDemo obj = new AllMethodsDemo(); 
        obj.instanceMethod(); 

        // === PARAMETERIZED METHOD ===
        // Passing an argument ("Denver") to greet()
        System.out.println("\n=== PARAMETERIZED METHOD ===");
        obj.greet("Denver");

        // === METHOD WITH RETURN TYPE ===
        // Calling add() which returns a value, then printing it
        System.out.println("\n=== METHOD WITH RETURN TYPE ===");
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);

        // === METHOD OVERLOADING ===
        // Two versions of display() -> compiler decides based on parameters
        System.out.println("\n=== METHOD OVERLOADING ===");
        obj.display();                   // no-argument version
        obj.display("Overloading in action!"); // version with String argument

        // === PRIVATE METHOD ACCESS ===
        // You cannot call secret() directly from outside the class,
        // but you can call it indirectly via callSecret().
        System.out.println("\n=== PRIVATE METHOD ACCESS ===");
        obj.callSecret();

        // === METHOD OVERRIDING (INHERITANCE) ===
        // Demonstrates runtime polymorphism
        System.out.println("\n=== METHOD OVERRIDING (INHERITANCE) ===");
        
        Parent p = new Parent(); // Parent reference -> Parent object
        p.showMessage(); // Calls Parent's version

        Child c = new Child();   // Child reference -> Child object
        c.showMessage(); // Calls Child's overridden version

        Parent poly = new Child(); 
        // Parent reference -> Child object (polymorphism)
        poly.showMessage(); // Calls Child's overridden version at runtime
    }
}
