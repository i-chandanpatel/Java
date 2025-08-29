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
        // Returns 0 if equal, a positive or negative number otherwise
        System.out.println("a.compareTo(b) " + a.compareTo(b)); // 0

        a = "Raam";
        System.out.println(a.compareTo(b)); 
        // -12: 'a' has 'a' at index 2, 'b' has 'm', so 'a' - 'm' = -12

        // 6. == operator: compares references (not content)
        System.out.println(a == b); // false, different references

        a = "Ram";

        // Works for string literals since they refer to same object in String pool
        System.out.println("a==b works only for this above mentioned kind of String " + (a == b)); // true

        // Creating two different String objects using 'new'
        String c = new String("John");
        String d = new String("John");

        // c and d point to different objects, even though content is same
        System.out.println("is c==d " + (c == d)); // false

        // Strings are immutable: modifying them creates a new object
        a += " Rajya"; // Concatenation creates a new String
        System.out.println("a after a+=\"Rajya\";" + a); // "Ram Rajya"

        // StringBuffer: mutable version of string, used for performance when modifying strings
        StringBuffer s = new StringBuffer();

        // Default capacity is 16 characters
        System.out.println("s.capacity() " + s.capacity()); // 16

        // Initial length is 0
        System.out.println("s.length() " + s.length());

        // 7. append(): adds content to the end of buffer
        System.out.println("s.append(\"John\") " + s.append("John")); // "John"

        // Capacity remains same until exceeded
        System.out.println("s.capacity() " + s.capacity()); // 16
        System.out.println("s.length() " + s.length()); // 4

        // 8. insert(): inserts content at given position
        System.out.println("s.insert(4,\"y\") " + s.insert(4, "y")); // "Johny"

        // 9. ensureCapacity(): ensures minimum capacity (resizes if needed)
        s.ensureCapacity(20);
        System.out.println("s.ensureCapacity(20) " + s.capacity());

        // 10. delete(): deletes characters from start index to end index (exclusive)
        System.out.println("s.delete(1,3) " + s.delete(1, 3)); // "Jny"
        System.out.println();
        
        // Additional useful methods:
        
        // 11. toUpperCase() and toLowerCase()
        String name = "Sample";
        System.out.println("name.toUpperCase(): " + name.toUpperCase()); // "SAMPLE"
        System.out.println("name.toLowerCase(): " + name.toLowerCase()); // "sample"

        // 12. equals(): compares string content
        System.out.println("a.equals(b): " + a.equals(b)); // true

        // 13. equalsIgnoreCase()
        System.out.println("\"Ram\".equalsIgnoreCase(\"ram\"): " + "Ram".equalsIgnoreCase("ram")); // true

        // 14. substring(): returns a part of the string
        System.out.println("name.substring(1,4): " + name.substring(1, 4)); // "amp"

        // 15. replace(): replaces character or string
        System.out.println("name.replace(\"a\", \"o\"): " + name.replace("a", "o")); // "Somple"

        // 16. reverse() from StringBuffer
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("sb.reverse(): " + sb.reverse()); // "olleh"
    }
}
