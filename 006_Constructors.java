/*
 * ============================================================
 * JAVA CONSTRUCTORS - QUICK REVISION
 * ============================================================
 *
 * Covers:
 *
 * 1. Constructor overloading
 * 2. this()
 * 3. super()
 * 4. Implicit super()
 * 5. Constructor execution order
 * 6. Multi-level inheritance
 * 7. this.variable
 * 8. Copy-constructor style
 * 9. Default constructor
 *
 * KEY RULES
 *
 * this(...)  -> another constructor in SAME class
 * super(...) -> constructor of PARENT class
 *
 * this(...) and super(...) must be the FIRST statement.
 *
 * If super(...) is not written, Java inserts super()
 * automatically (if parent has an accessible no-arg constructor).
 *
 * Parent constructor executes before child constructor body.
 *
 * Constructors are selected by:
 *   - number of arguments
 *   - type of arguments
 *   - order of arguments
 *
 * Constructors are NOT inherited.
 *
 * If you write any constructor, Java does NOT provide
 * the default no-argument constructor automatically.
 * ============================================================
 */


public class ConstructorRevision {

    public static void main(String[] args) {

        // =====================================================
        // 1. CONSTRUCTOR OVERLOADING
        // =====================================================

        Person p1 = new Person();
        Person p2 = new Person("Rahul");
        Person p3 = new Person("Rahul", 25);


        // =====================================================
        // 2. this() - CONSTRUCTOR CHAINING
        // =====================================================

        Student s1 = new Student();
        Student s2 = new Student("Aman");
        Student s3 = new Student("Aman", 20);


        // =====================================================
        // 3. super() / super(argument)
        // =====================================================

        Dog d1 = new Dog();
        Dog d2 = new Dog("Kittu");


        // =====================================================
        // 4. MULTI-LEVEL CONSTRUCTOR CHAINING
        // =====================================================

        Puppy p = new Puppy();


        // =====================================================
        // 5. COPY CONSTRUCTOR STYLE
        // =====================================================

        Student original = new Student("Ravi", 22);
        Student copy = new Student(original);
    }
}


/*
 * ============================================================
 * 1. CONSTRUCTOR OVERLOADING
 * ============================================================
 *
 * new Person()
 *       -> Person()
 *
 * new Person("Rahul")
 *       -> Person(String)
 *
 * new Person("Rahul", 25)
 *       -> Person(String, int)
 * ============================================================
 */

class Person {

    String name;
    int age;


    Person() {

        System.out.println("Person()");
    }


    Person(String name) {

        System.out.println("Person(String)");
    }


    Person(String name, int age) {

        System.out.println("Person(String, int)");
    }
}


/*
 * ============================================================
 * 2. this() - SAME CLASS CONSTRUCTOR CHAINING
 * ============================================================
 *
 * new Student()
 *
 * Student()
 *     |
 *     +-- this("Unknown", 0)
 *             |
 *             +-- Student(String, int)
 *
 *
 * new Student("Aman")
 *
 * Student(String)
 *     |
 *     +-- this(name, 18)
 *             |
 *             +-- Student(String, int)
 * ============================================================
 */

class Student {

    String name;
    int age;


    Student() {

        this("Unknown", 0);

        System.out.println("Student()");
    }


    Student(String name) {

        this(name, 18);

        System.out.println("Student(String)");
    }


    Student(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Student(String, int)");
    }


    /*
     * Copy-constructor style
     *
     * Not a special Java feature.
     * Just a constructor accepting an object
     * of the same class.
     */

    Student(Student other) {

        this(other.name, other.age);

        System.out.println("Student(Student)");
    }
}


/*
 * ============================================================
 * 3. super()
 * ============================================================
 *
 * Dog extends Animal
 *
 * new Dog()
 *
 * Dog()
 *   |
 *   +-- super()
 *          |
 *          +-- Animal()
 *
 *
 * new Dog("Kittu")
 *
 * Dog(String)
 *   |
 *   +-- super(name)
 *          |
 *          +-- Animal(String)
 * ============================================================
 */

class Animal {

    Animal() {

        System.out.println("Animal()");
    }


    Animal(String name) {

        System.out.println("Animal(String): " + name);
    }
}


class Dog extends Animal {


    Dog() {

        super();

        System.out.println("Dog()");
    }


    Dog(String name) {

        super(name);

        System.out.println("Dog(String)");
    }
}


/*
 * ============================================================
 * 4. IMPLICIT super()
 * ============================================================
 *
 * If you don't write super(...), Java inserts:
 *
 *     super();
 *
 * provided the parent has an accessible no-arg constructor.
 * ============================================================
 */

class Cat extends Animal {

    Cat() {

        // Java automatically inserts:
        //
        // super();

        System.out.println("Cat()");
    }
}


/*
 * ============================================================
 * 5. MULTI-LEVEL INHERITANCE
 * ============================================================
 *
 * Puppy -> Dog -> Animal
 *
 * new Puppy()
 *
 * Puppy()
 *    |
 *    +-- implicit super()
 *           |
 *           +-- Dog()
 *                  |
 *                  +-- super()
 *                         |
 *                         +-- Animal()
 *
 * ACTUAL EXECUTION ORDER:
 *
 * Animal()
 * Dog()
 * Puppy()
 * ============================================================
 */

class Puppy extends Dog {

    Puppy() {

        // implicit super() -> Dog()

        System.out.println("Puppy()");
    }
}


/*
 * ============================================================
 * 6. DEFAULT CONSTRUCTOR
 * ============================================================
 *
 * No constructor is written.
 *
 * Compiler provides approximately:
 *
 *     Car() {}
 *
 * ============================================================
 */

class Car {

    int price = 100000;
}


/*
 * ============================================================
 * QUICK REFERENCE
 * ============================================================
 *
 *
 * CONSTRUCTOR SELECTION
 * ---------------------
 *
 * new A()
 *     -> A()
 *
 * new A(10)
 *     -> A(int)
 *
 * new A("X")
 *     -> A(String)
 *
 * new A("X", 10)
 *     -> A(String, int)
 *
 *
 *
 * this()
 * -------
 *
 * Same class
 * Constructor chaining
 * Must be first statement
 *
 *
 * super()
 * --------
 *
 * Parent class
 * Constructor chaining
 * Must be first statement
 *
 *
 *
 * INHERITANCE
 * -----------
 *
 * Parent constructor
 *       ↓
 * Child constructor
 *
 *
 *
 * IMPORTANT
 * ---------
 *
 * Constructors are NOT inherited.
 *
 * If no constructor is written:
 *     compiler provides no-arg constructor.
 *
 * If any constructor is written:
 *     compiler does NOT provide no-arg constructor.
 *
 * ============================================================
 */
