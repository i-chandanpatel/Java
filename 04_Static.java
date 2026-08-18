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

