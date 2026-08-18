class Basics{
  public static void main(String args[]){
    //Data Types
    
    //Integer
    int num=10;
    long num1=10;
    short num2=10;
    byte num3=10;
    //Float
    double decimal=2.4;
    float f=2.4f;  //if f not used than it will be double type
    boolean flag=true;  //Only accepts true/false not 0/1
    char c="A";
    String txt="Hello World";

     // ======== WIDENING (Implicit) ========
        byte b = 10;
        short s = b;         // byte -> short
        int i = s;           // short -> int
        long l = i;          // int -> long
        float f = l;         // long -> float
        double d = f;        // float -> double

        System.out.println("=== WIDENING (Implicit) ===");
        System.out.println("byte -> short: " + s);
        System.out.println("short -> int: " + i);
        System.out.println("int -> long: " + l);
        System.out.println("long -> float: " + f);
        System.out.println("float -> double: " + d);

        // ======== NARROWING (Explicit) ========
        double d2 = 123.456;
        float f2 = (float) d2;  // double -> float
        long l2 = (long) f2;    // float -> long
        int i2 = (int) l2;      // long -> int
        short s2 = (short) i2;  // int -> short
        byte b2 = (byte) s2;    // short -> byte

        System.out.println("\n=== NARROWING (Explicit) ===");
        System.out.println("double -> float: " + f2);
        System.out.println("float -> long: " + l2);
        System.out.println("long -> int: " + i2);
        System.out.println("int -> short: " + s2);
        System.out.println("short -> byte: " + b2);

        // ======== CHAR <-> INT ========
        char c = 'A';         // 'A' = 65
        int ascii = c;        // char -> int
        char c2 = (char) 66;  // int -> char ('B')

        System.out.println("\n=== CHAR <-> INT ===");
        System.out.println("char -> int: " + ascii);
        System.out.println("int -> char: " + c2);

        // ======== MATH ROUNDING OPTIONS ========
        double val = 9.78;
        int truncated = (int) val;              // truncates
        int rounded = (int) Math.round(val);    // rounds nearest
        int floored = (int) Math.floor(val);    // always down
        int ceiled  = (int) Math.ceil(val);     // always up

        System.out.println("\n=== MATH ROUNDING ===");
        System.out.println("Original double: " + val);
        System.out.println("Truncated: " + truncated);
        System.out.println("Rounded: " + rounded);
        System.out.println("Floored: " + floored);
        System.out.println("Ceiled: " + ceiled);

        // ======== STRING -> NUMBER ========
        String strNum = "456";
        int numFromStr = Integer.parseInt(strNum);
        double dblFromStr = Double.parseDouble("123.45");

        System.out.println("\n=== STRING -> NUMBER ===");
        System.out.println("String to int: " + numFromStr);
        System.out.println("String to double: " + dblFromStr);

        // ======== NUMBER -> STRING ========
        int num = 789;
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);

        System.out.println("\n=== NUMBER -> STRING ===");
        System.out.println("Int to String (valueOf): " + str1);
        System.out.println("Int to String (toString): " + str2);

        // ======== BOOLEAN <-> STRING ========
        boolean boolVal = true;
        String boolStr = String.valueOf(boolVal);
        boolean parsedBool = Boolean.parseBoolean("true");

        System.out.println("\n=== BOOLEAN <-> STRING ===");
        System.out.println("Boolean -> String: " + boolStr);
        System.out.println("String -> Boolean: " + parsedBool);

    //Logical operators
    //AND-> &&
    //OR-> ||
    //NOT-> !

    //Ternery operators
    int a=4,b=5;
    int result=(a>b) ? "a is greator" : "b is greator";

    //if-else
    if(a>b)  System.out.print("a is greator");
    else if(a==b)  System.out.print("both equal");
    else  System.out.print("b is greator");

    System.out.print("Enter your age: ");
    Scanner s=new Scanner(Syatem.in);
    int age=s.nextint();
    
    //switch case
    switch(age){
      case >=18:  System.out.println("You can get license");
      case <18:  System.out.println("You can't get license");
    }
    
  }
}
