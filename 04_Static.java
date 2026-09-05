/*
 * ============================================================
 * JAVA STATIC
 * ============================================================
 *
 * Covers:
 *
 * 1. Static variable
 * 2. Static final variable
 * 3. Static block
 * 4. Instance method
 * 5. Static method
 * 6. Static nested class
 * 7. Non-static inner class
 * 8. Static vs non-static members
 * 9. Accessing static members
 * 10. Shared nature of static variables
 *
 *
 * CORE RULES
 * ------------------------------------------------------------
 *
 * static variable
 *     -> belongs to CLASS, not individual objects
 *
 * static method
 *     -> belongs to CLASS
 *     -> can directly access only static members
 *     -> no 'this' or 'super'
 *
 * static block
 *     -> executes once when the class is initialized
 *
 * static nested class
 *     -> does NOT require outer-class object
 *
 * non-static inner class
 *     -> requires outer-class object
 *
 * static member
 *     -> access using ClassName.member
 *
 * instance member
 *     -> access using object.member
 *
 * ============================================================
 */


class StaticDemo {

    // 1. STATIC VARIABLE

    /* One copy belongs to the class.
     * All objects share the same 'c'.
     */

    static int c = 5;


    // 2. STATIC FINAL VARIABLE

    static final double PI = 3.14159;


    // =========================================================
    // 3. STATIC BLOCK
    // =========================================================

    /*
     * Executes once when StaticDemo is initialized.
     *
     * Typical triggers:
     *     StaticDemo.c
     *     StaticDemo.divide(...)
     *     new StaticDemo()
     *
     * Static initialization happens before the relevant static access/object creation proceeds.
     */

    static {
        System.out.println(
            "Static block executed. c = " + c
        );
    }


    // 4. INSTANCE METHOD

    /*
     * Non-static method.
     *
     * Requires an object:
     *
     *     StaticDemo obj = new StaticDemo();
     *     obj.add(8, 2);
     *
     * An instance method can access:
     *
     *     - instance members
     *     - static members
     */

    public String add(int a, int b) {

        return "Sum = " + (a + b)
             + ", static c = " + c;
    }


    // 5. STATIC METHOD


    /*
     * No object required:
     *
     *     StaticDemo.divide(8, 2);
     *
     * A static method can directly access static members.
     *
     * It CANNOT directly access instance members because
     * there is no particular object / 'this' associated with
     * a static method.
     */

    public static int divide(int a, int b) {

        System.out.println(
            "c changed from " + c + " to " + (++c)
        );

        return a / b;
    }


    // 6. STATIC NESTED CLASS

    /*
     * StaticInner is a STATIC NESTED CLASS.
     *
     * No StaticDemo object is required.
     * StaticDemo.StaticInner.show();
     *
     * Creation:
     *
     *     StaticDemo.StaticInner inner =
     *         new StaticDemo.StaticInner();
     */

    static class StaticInner {

        void show() {

            System.out.println(
                "Inside static nested class. c = " + c
            );
        }
    }



    // 7. NON-STATIC INNER CLASS

    /*
     * Inner is NON-STATIC.
     *
     * Therefore an outer StaticDemo object is required.
     *
     * Creation:
     *
     *     StaticDemo outer = new StaticDemo();
     *
     *     StaticDemo.Inner inner =
     *         outer.new Inner();
     */

    class Inner {

        void show() {

            System.out.println(
                "Inside non-static inner class. c = " + c
            );
        }
    }
}


/*
 * ============================================================
 * STATIC vs NON-STATIC NESTED CLASSES
 * ============================================================
 *
 * The following four classes cover every combination:
 *
 *              NESTED CLASS
 *                   |
 *          +--------+--------+
 *          |                 |
 *        static          non-static
 *          |                 |
 *     no outer object    outer object
 *        needed            needed
 *
 *
 * Then each class can have:
 *
 *          MEMBER
 *             |
 *       +-----+-----+
 *       |           |
 *     static    non-static
 *
 * ============================================================
 */
class Demo {


    // =========================================================
    // IN1
    // =========================================================
    //
    // static class
    // static variable
    //
    // Neither requires an object.
    // =========================================================

    static class IN1 {

        static int a = 1;
    }


    // =========================================================
    // IN2
    // =========================================================
    //
    // static class
    // instance variable
    //
    // Demo object is NOT required,
    // but IN2 object IS required to access 'a'.
    // =========================================================

    static class IN2 {

        int a = 2;
    }


    // =========================================================
    // IN3
    // =========================================================
    //
    // non-static inner class
    // static variable
    //
    // Demo object is required to CREATE an IN3 object.
    //
    // 'a' itself is static, so IN3 object is NOT required
    // to access 'a'.
    // =========================================================

    class IN3 {

        static int a = 3;
    }


    // =========================================================
    // IN4
    // =========================================================
    //
    // non-static inner class
    // instance variable
    //
    // Demo object + IN4 object are required.
    // =========================================================

    class IN4 {

        int a = 4;
    }
}


/*
 * ============================================================
 * HOW TO ACCESS IN1, IN2, IN3 AND IN4
 * ============================================================
 *
 *
 * 1. IN1
 * ============================================================
 *
 * static class
 * static variable
 *
 * Code:
 *
 *     System.out.println(Demo.IN1.a);
 *
 *
 * Why?
 *
 * IN1 is static
 *     -> Demo object NOT required
 *
 * a is static
 *     -> IN1 object NOT required
 *
 *
 * Therefore:
 *
 *     Demo.IN1.a
 *
 *
 *
 * ------------------------------------------------------------
 *
 *
 * 2. IN2
 * ============================================================
 *
 * static class
 * instance variable
 *
 * Code:
 *
 *     Demo.IN2 obj = new Demo.IN2();
 *
 *     System.out.println(obj.a);
 *
 *
 * Why?
 *
 * IN2 is static
 *     -> Demo object NOT required
 *
 * a is non-static
 *     -> IN2 object IS required
 *
 *
 * Therefore:
 *
 *     Demo.IN2 obj = new Demo.IN2();
 *     obj.a
 *
 *
 *
 * ------------------------------------------------------------
 *
 *
 * 3. IN3
 * ============================================================
 *
 * non-static inner class
 * static variable
 *
 * Code:
 *
 *     Demo demo = new Demo();
 *
 *     Demo.IN3 obj = demo.new IN3();
 *
 *     System.out.println(Demo.IN3.a);
 *
 *
 * Why?
 *
 * IN3 is non-static
 *     -> Demo object IS required to create IN3
 *
 * a is static
 *     -> IN3 object NOT required to access a
 *
 *
 * Therefore:
 *
 *     Demo demo = new Demo();
 *     Demo.IN3 obj = demo.new IN3();
 *
 *     Demo.IN3.a
 *
 *
 *
 * ------------------------------------------------------------
 *
 *
 * 4. IN4
 * ============================================================
 *
 * non-static inner class
 * instance variable
 *
 * Code:
 *
 *     Demo demo = new Demo();
 *
 *     Demo.IN4 obj = demo.new IN4();
 *
 *     System.out.println(obj.a);
 *
 *
 * Why?
 *
 * IN4 is non-static
 *     -> Demo object IS required
 *
 * a is non-static
 *     -> IN4 object IS required
 *
 *
 * Therefore:
 *
 *     Demo demo = new Demo();
 *     Demo.IN4 obj = demo.new IN4();
 *     obj.a
 *
 *
 * =====================================
 * QUICK MATRIX =====================================
Class Variable NestedClass Required            
IN1    static     static    Nothing
IN2    static   non-static  IN2 obj
IN3  non-static   static    Demo obj
IN4  non-static non-static  Demo+IN4 =====================================
 */

