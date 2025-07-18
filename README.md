Java is a high-level, object-orientied programming language. It is platform-independent, which means we can write code once and run it anywhere using the Java Virtual Machine (JVM). Java is mostly used for building desktop applications, web applications, Android apps, and enterprise systems.


Key Features of Java
Platform Independent: Java is famous for its Write Once, Run Anywhere (WORA) feature. This means we can write our Java code once, and it will run on any device or operating system without changing anything.
Simple: Java syntax is very straightforward and very easy to learn. Java removes complex features like pointers and multiple inheritance, which makes it a good choice for beginners.
Object-Oriented: Java follows the object-oriented programming. This makes code clean and reusable.
Secured: Java does not support pointers, it includes built-in protections to keep our programs secure from common problems like memory leakage.
Multithreading: Java programs can do many things at the same time using multiple threads. This is useful for handling complex tasks like processing transactions.
Just-In-Time (JIT) Compiler: Java uses a JIT compiler. It improves performance by converting the bytecode into machine readable code at the time of execution.
Understanding Hello World Program in Java
When we learn any programming language, the first step is writing a simple program to display "Hello World". So, here is a simple Java program that displays "Hello World" on the screen.


Java Program Execution Flow
Write code in a file like HelloWorld.java.
The Java Compiler "javac" compiles it into bytecode "HelloWorld.class".
The JVM (Java Virtual Machine) reads the .class file and interprets the bytecode.
JVM converts bytecode to machine readable code i.e. "binary" (001001010) and then execute the program.


Comments in Java
Single-line comment
// This is a comment
Multi-line comment
/*
This is a multi-line comment.
This is useful for explaining larger sections of code.
*/


Curly Braces and Indentation in Java
In Java, curly braces {} are used to define blocks of code. For example, the body of a class or method is enclosed within curly braces.

Example:

public class Geeks{
    public static void main(String[] args) {
        {
            System.out.println("This is inside the block.");
        }

        System.out.println("This is outside the block.");
    }
}
The code block inside {} runs unconditionally and prints a message.
Curly brackets {} group multiple statements into a single block, even without conditions.
Naming Conventions in Java
Java uses standard naming rules that make the code easier and improves the readability.
In Java, the class names start with a capital letter for example, HelloWorld. Method and variable names start with a lowercase letter and use camelCase like printMessage.
And the constants are written in all uppercase letters with underscores like MAX_SIZE.


Java is used for:
Mobile App Development: Android development using Android Studio.
Web Development: Using frameworks like Spring Boot and Jakarta EE.
Desktop GUI Applications: With libraries like JavaFX and Swing.
Enterprise Applications: Java is the backbone of many banking and business software.
Game Development: Through game engines like LibGDX.
Big Data Technologies: Like Hadoop and Apache Kafka.
Internet of Things (IoT): Java can run on embedded systems and devices.
Cloud-based Applications: Java is used in services on AWS, Azure, and Google Cloud.
Scientific Applications: Java is used in tools that process large amounts of scientific data.


Advanatages of JDK
Complete Development Kit: It Includes compiler (javac), JRE, JVM, and debugging tools.
Platform Independence: It write once, run anywhere (WORA) using JVM.
Rich Libraries & APIs: JDK has built-in support for networking, I/O, databases, and more.
Performance Optimization: Just-In-Time (JIT) compiler boosts execution speed.
Backward Compatibility: Older Java apps still run on newer JDK versions.

Disadvantages of JDK
Large Memory Usage: JDK consumes more RAM compared to some lightweight languages.
Complex Setup: Requires manual environment variable configuration.
Slower Startup Time: JVM initialization can delay execution.
License Restrictions: Oracle JDK requires a commercial license for business use.


Class Definition
Every Java program must have at least one class. Here, the class is defined using the class keyword:

public class HelloWorld {
    // Statements go here
}

Note: If the class is public, the filename must match the class name HelloWorld.java


2. main Method
In the Java programming language, every application must contain a main method as it is the entry point of the application:

public static void main(String[] args)

public: Allows JVM to access the method from anywhere.
static: Method can run without creating an object.
void: It doesn’t return any value.
String[] args: Accepts command-line arguments.


1. Local Variables
Declared inside a method, constructor, or block.
Created when the method/block is executed.
Destroyed once the method finishes.
Must be initialized before use (no default values).

2. Instance Variables
Declared inside a class but outside any method/constructor.
Each object has its own copy.
They get default values if not initialized.
Lifetime = as long as the object exists.

3. Static Variables (Class Variables)
Declared with the static keyword.
Shared among all objects of the class (only one copy exists).
Can be accessed using class name.

class VariableTypes {
    int instanceVar = 42;         // instance variable
    static String staticVar = "Shared"; // static variable

    void demoMethod() {
        int localVar = 10; // local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypes obj1 = new VariableTypes();
        VariableTypes obj2 = new VariableTypes();

        obj1.demoMethod();

        // Changing static variable affects all objects
        obj2.staticVar = "Updated";
        obj1.demoMethod(); // will show Updated for staticVar
    }
}


Instance Variables vs Static Variables
Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create. Thus, static variables are good for memory management.
Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. In the case of a static variable, changes will be reflected in other objects as static variables are common to all objects of a class.
We can access instance variables through object references, and static variables can be accessed directly using the class name.
Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed. Static variables are created when the program starts and destroyed when the program stops.

Using uninitialized local variables: Accessing a local variable without initializing it leads to a compile-time error.
Confusing == and .equals() for Strings: == is used to compare object references, while .equals() is used to compare the content of the strings.
Modifying static variables incorrectly: Changing static variables in a multi-threaded environment can lead to thread safety issues


Non-Primitive (Reference) Data Types
The Non-Primitive (Reference) Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc.

1. Strings
Strings are defined as an array of characters. The difference between a character array and a string in Java is, that the string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char-type entities. Unlike C/C++, Java strings are not terminated with a null character.
Note: String cannot be modified after creation. Use StringBuilder for heavy string manipulation

2. Class
A Class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

Modifiers : A class can be public or has default access. Refer to access specifiers for classes or interfaces in Java
Class name: The name should begin with an initial letter (capitalized by convention).
Superclass(if any): The name of the class's parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body is surrounded by braces, { }.

3. Object
An Object is a basic unit of Object-Oriented Programming and represents real-life entities.  A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of :

State: It is represented by the attributes of an object. It also reflects the properties of an object.
Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
Identity: It gives a unique name to an object and enables one object to interact with other objects.

4. Interface
Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).

Interfaces specify what a class must do and not how. It is the blueprint of the class.
An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
A Java library example is Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

// Demonstrating the working of interface
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); 
    }
}


5. Array
An Array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. The following are some important points about Java arrays.

In Java, all arrays are dynamically allocated. (discussed below)
Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using size.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered and each has an index beginning with 0.
Java array can also be used as a static field, a local variable, or a method parameter.
The size of an array must be specified by an int value and not long or short.
The direct superclass of an array type is Object.
Every array type implements the interfaces Cloneable and java.io.Serializable.

