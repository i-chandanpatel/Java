class StaticMethod {
    
    // Static variable: Shared across all instances and accessible in static context
    static int c = 5;

    // Final static variable: A constant
    static final double PI = 3.14159;

    // Static block: Runs once when the class is first loaded
    static {
        System.out.println("Static block executed. Initial value of c: " + c);
    }

    // Instance method (non-static): Requires object to call
    public String add(int a, int b) {
        return "Sum is " + (a + b) + " and current value of static c is " + c;
    }

    // Static method: Can be called using class name, modifies static variable
    public static int divide(int a, int b) {
        System.out.println("c incremented in divide method from " + c + " to " + (++c));
        return a / b;
    }

    // Static nested class: Can be instantiated without outer class object
    static class StaticInner {
        void show() {
            System.out.println("Inside static nested class. Value of static c is " + c);
        }
    }

    // Static method accessing static constant
    public static void printPi() {
        System.out.println("Value of final static constant PI is: " + PI);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // 1. Calling static method directly using class name
        System.out.println("Output of divide method: " + StaticMethod.divide(8, 2));
        
        // 2. Creating object to call instance method
        StaticMethod s = new StaticMethod();
        System.out.println(s.add(8, 2));

        // 3. Accessing static nested class
        StaticMethod.StaticInner inner = new StaticMethod.StaticInner();
        inner.show();

        // 4. Accessing final static constant and method
        StaticMethod.printPi();

        // 5. Demonstrating shared nature of static variable
        StaticMethod anotherInstance = new StaticMethod();
        System.out.println("Accessing static c from another object: " + StaticMethod.c);

        // 6. Modifying static variable from different object
        StaticMethod.c = 100;
        System.out.println("Static c modified to 100. Checking from first object: " + s.add(1, 1));
        System.out.println("Static c from another object: " + anotherInstance.add(2, 2));
    }
}
