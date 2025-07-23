class A {
    // Default constructor of A
    public A() {
        System.out.println("in A() -> No value passed");
    }

    // Parameterized constructor of A
    public A(int n) {
        System.out.println("in A(int n) -> Value passed: " + n);
    }
}

class B extends A {

    // Default constructor of B
    public B() {
        // super() is called implicitly here (calls A())
        System.out.println("in B() -> No value passed");
    }

    // Parameterized constructor of B
    public B(int n) {
        // super() is still implicitly called (calls A())
        System.out.println("in B(int n) -> Value passed: " + n);
    }

    // Another constructor in B that explicitly calls A(int)
    public B(int x, int y) {
        super(x); // explicitly calling parameterized constructor of A
        System.out.println("in B(int x, int y) -> Values passed: " + x + ", " + y);
    }
}

public class Demo {
    public static void main(String[] args) {

        System.out.println("---- Case 1: Default B ----");
        B obj1 = new B(); 
        // Calls B(), which implicitly calls A()

        System.out.println("\n---- Case 2: Parameterized B ----");
        B obj2 = new B(5); 
        // Calls B(int), which implicitly calls A()

        System.out.println("\n---- Case 3: Parameterized B with explicit super ----");
        B obj3 = new B(10, 20); 
        // Calls B(int, int), which explicitly calls A(int)
    }
}
