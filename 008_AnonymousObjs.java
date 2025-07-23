class Test {
    void greet() {
        System.out.println("Hello from anonymous object!");
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class AnonymousObjectsDemo {
    public static void main(String[] args) {

        // Anonymous object calling a single method
        new Test().greet();

        // Anonymous object used for another method
        new Test().add(5, 10);

        // Normal object for multiple calls
        Test t = new Test();
        t.greet();
        t.add(20, 30);
    }
}
