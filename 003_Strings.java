class Main {
    public static void main(String[] args) {
        // String literal - stored in String pool
        String a = "John";

        // String object created using 'new' - stored in heap memory
        String b = new String("Denver");

        // 1. length(): returns the length of the string
        System.out.println(a.length()); // 4

        // 2. charAt(): returns the character at the specified index (0-based)
        System.out.println(a.charAt(1)); // 'o'

        // 3. concat(): concatenates two strings
        System.out.println(a.concat(b)); // "JohnDenver"

        // 4. + operator: also concatenates strings
        System.out.println(a + b); // "JohnDenver"

        // Reassigning new values
        a = "Ram";
        b = "Ram";

        // 5. compareTo(): compares strings lexicographically
        System.out.println("a.compareTo(b) " + a.compareTo(b)); // 0

        a = "Raam";
        System.out.println(a.compareTo(b)); // -12

        // 6. == operator: compares references (not content)
        System.out.println(a == b); // false

        a = "Ram";

        // Works for string literals since they refer to same object in String pool
        System.out.println("a==b works only for this above mentioned kind of String " + (a == b)); // true

        // Creating two different String objects using 'new'
        String c = new String("John");
        String d = new String("John");

        // c and d point to different objects, even though content is same
        System.out.println("is c==d " + (c == d)); // false

        // Strings are immutable: modifying them creates a new object
        a += " Rajya";
        System.out.println("a after a+=\"Rajya\";" + a); // "Ram Rajya"

        // StringBuffer: mutable version of string
        StringBuffer s = new StringBuffer();
        System.out.println("s.capacity() " + s.capacity()); // 16
        System.out.println("s.length() " + s.length());
        System.out.println("s.append(\"John\") " + s.append("John"));
        System.out.println("s.capacity() " + s.capacity());
        System.out.println("s.length() " + s.length());
        System.out.println("s.insert(4,\"y\") " + s.insert(4, "y"));
        s.ensureCapacity(20);
        System.out.println("s.ensureCapacity(20) " + s.capacity());
        System.out.println("s.delete(1,3) " + s.delete(1, 3));
        System.out.println();

        // Additional useful methods:

        String name = "Sample";
        System.out.println("name.toUpperCase(): " + name.toUpperCase());
        System.out.println("name.toLowerCase(): " + name.toLowerCase());

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("\"Ram\".equalsIgnoreCase(\"ram\"): " + "Ram".equalsIgnoreCase("ram"));
        System.out.println("name.substring(1,4): " + name.substring(1, 4));
        System.out.println("name.replace(\"a\", \"o\"): " + name.replace("a", "o"));

        StringBuffer sb = new StringBuffer("hello");
        System.out.println("sb.reverse(): " + sb.reverse());

        // 17. split(): splits a string into array based on delimiter
        String fruits = "apple,banana,orange";
        String[] arr = fruits.split(",");
        System.out.println("split():");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 18. format(): formatted string similar to printf
        String formatted = String.format("Hello %s, you are %d years old.", "Alice", 25);
        System.out.println("format(): " + formatted);

        // 19. toCharArray(): converts string to character array
        char[] chars = name.toCharArray();
        System.out.println("toCharArray():");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 20. join(): joins multiple strings with a delimiter
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("join(): " + joined);

        // 21. intern(): returns canonical representation from string pool
        String e = new String("Test").intern();
        String f = "Test";
        System.out.println("intern(): " + (e == f)); // true

        // 22. matches(): checks if string matches regex pattern
        String pattern = "[A-Z][a-z]+";
        System.out.println("matches(): " + "John".matches(pattern)); // true
        System.out.println("matches(): " + "john".matches(pattern)); // false

        // 23. repeat(): repeats the string n times (Java 11+)
        System.out.println("repeat(): " + "Hi ".repeat(3)); // Hi Hi Hi 

        // 24. strip(): removes leading and trailing whitespace (Unicode-aware)
        String messy = "  \t Hello \n ";
        System.out.println("strip(): '" + messy.strip() + "'");

        // 25. trim(): removes leading and trailing spaces (ASCII only)
        System.out.println("trim(): '" + messy.trim() + "'");
    }
}
