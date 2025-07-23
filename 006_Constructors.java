class Student {
    String name;
    int age;

    // 1️⃣ DEFAULT CONSTRUCTOR
    // -> Java provides a default constructor automatically 
    //    if no constructor is written.
    // -> It simply initializes object with default values (null, 0, false)
    // But if we define any constructor, the default is NOT provided.
    // (So here we explicitly write one)

    Student() {  
        // This is also called a No-Argument constructor
        System.out.println("No-Argument Constructor called!");
        name = "Unknown"; // setting default values
        age = 0;
    }

    // 2️⃣ PARAMETERIZED CONSTRUCTOR
    // -> Allows passing values during object creation
    Student(String n, int a) {
        System.out.println("Parameterized Constructor called!");
        name = n;
        age = a;
    }

    // 3️⃣ COPY CONSTRUCTOR
    // -> Java doesn't have a built-in copy constructor, but we can create one
    // -> Used to copy data from one object to another
    Student(Student other) {
        System.out.println("Copy Constructor called!");
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {

        // ✅ 1. Calling No-Argument Constructor
        Student s1 = new Student();  // calls Student()
        s1.display();  // Output -> Name: Unknown, Age: 0

        // ✅ 2. Calling Parameterized Constructor
        Student s2 = new Student("Alice", 21);  // calls Student(String, int)
        s2.display();  // Output -> Name: Alice, Age: 21

        // ✅ 3. Calling Copy Constructor
        Student s3 = new Student(s2);  // calls Student(Student)
        s3.display();  // Output -> Name: Alice, Age: 21 (copied from s2)
    }
}
