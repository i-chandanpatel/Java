import java.util.Arrays;
import java.util.Locale;
import java.nio.charset.StandardCharsets;

class Main {
    public static void main(String[] args) {
        // =================== STRING BASICS ===================
        // String literal - stored in String pool
        String a = "John";

        // String object created using Constructor 'new' - stored in heap memory
        String b = new String("Denver");

        // 1. length(): returns the length of the string
        System.out.println("length(): " + a.length()); // 4

        // 2. charAt(): returns the character at the specified index
        System.out.println("charAt(1): " + a.charAt(1)); // 'o'

        // 3. concat(): concatenates two strings
        System.out.println("concat(): " + a.concat(b)); // "JohnDenver"

        // 4. + operator: also concatenates strings
        System.out.println("+: " + (a + b)); // "JohnDenver"

        // Reassigning values
        a = "Ram";
        b = "Ram";

        // 5. compareTo(): compares strings lexicographically
        System.out.println("compareTo(): " + a.compareTo(b)); // 0

        a = "Raam";
        System.out.println("compareTo(): " + a.compareTo(b)); // -12

        // 6. == operator: compares references (not content)
        System.out.println("== : " + (a == b)); // false

        a = "Ram";
        System.out.println("== works for pool literals: " + (a == b)); // true

        // Creating two different String objects
        String c = new String("John");
        String d = new String("John");
        System.out.println("is c==d? " + (c == d)); // false

        // 7. Strings are immutable: modifying creates a new object
        a += " Rajya";
        System.out.println("a after +=: " + a); // "Ram Rajya"


        // =================== STRINGBUFFER ===================
        // Mutable, thread-safe version of string
        StringBuffer s = new StringBuffer();
        System.out.println("capacity(): " + s.capacity()); // 16 default
        System.out.println("length(): " + s.length());
        System.out.println("append(\"John\"): " + s.append("John"));
        System.out.println("capacity(): " + s.capacity());
        System.out.println("length(): " + s.length());
        System.out.println("insert(4,\"y\"): " + s.insert(4, "y"));
        s.ensureCapacity(20);
        System.out.println("ensureCapacity(20): " + s.capacity());
        System.out.println("delete(1,3): " + s.delete(1, 3));


        // =================== MORE STRING METHODS ===================
        String name = "Sample";
        System.out.println("toUpperCase(): " + name.toUpperCase());
        System.out.println("toLowerCase(): " + name.toLowerCase());
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + "Ram".equalsIgnoreCase("ram"));
        System.out.println("substring(1,4): " + name.substring(1, 4));
        System.out.println("replace(\"a\",\"o\"): " + name.replace("a", "o"));

        // Reverse using StringBuffer
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("reverse(): " + sb.reverse());

        // split()
        String fruits = "apple,banana,orange";
        String[] arr = fruits.split(",");
        System.out.println("split(): " + Arrays.toString(arr));

        // format()
        String formatted = String.format("Hello %s, you are %d years old.", "Alice", 25);
        System.out.println("format(): " + formatted);

        // toCharArray()
        char[] chars = name.toCharArray();
        System.out.println("toCharArray(): " + Arrays.toString(chars));

        // join()
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("join(): " + joined);

        // intern()
        String e = new String("Test").intern();
        String f = "Test";
        System.out.println("intern(): " + (e == f)); // true

        // matches()
        String pattern = "[A-Z][a-z]+";
        System.out.println("matches(\"John\"): " + "John".matches(pattern)); // true
        System.out.println("matches(\"john\"): " + "john".matches(pattern)); // false

        // repeat()
        System.out.println("repeat(): " + "Hi ".repeat(3));

        // strip() vs trim()
        String messy = "  \t Hello \n ";
        System.out.println("strip(): '" + messy.strip() + "'");
        System.out.println("trim(): '" + messy.trim() + "'");


        // =================== EXTRA STRING METHODS ===================
        String txt = "Java Programming 💡\nLine2\tTabbed";

        // contains, startsWith, endsWith
        System.out.println("contains(\"Program\"): " + txt.contains("Program"));
        System.out.println("startsWith(\"Java\"): " + txt.startsWith("Java"));
        System.out.println("endsWith(\"bed\"): " + txt.endsWith("bed"));

        // indexOf, lastIndexOf
        System.out.println("indexOf('a'): " + txt.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + txt.lastIndexOf('a'));

        // isEmpty, isBlank
        System.out.println("isEmpty(): " + "".isEmpty());
        System.out.println("isBlank(): " + "   ".isBlank());

        // compareToIgnoreCase
        System.out.println("compareToIgnoreCase: " + "java".compareToIgnoreCase("JAVA"));

        // contentEquals
        StringBuilder csb = new StringBuilder("Java Programming 💡\nLine2\tTabbed");
        System.out.println("contentEquals(): " + txt.contentEquals(csb));

        // regionMatches
        System.out.println("regionMatches(ignoreCase=true, JAVA vs txt): " +
                "JAVA".regionMatches(true, 0, txt, 0, 4));

        // getBytes and getChars
        byte[] utf8 = txt.getBytes(StandardCharsets.UTF_8);
        System.out.println("getBytes length: " + utf8.length);

        char[] slice = new char[4];
        txt.getChars(0, 4, slice, 0); // copy "Java"
        System.out.println("getChars(0,4): " + Arrays.toString(slice));

        // valueOf and copyValueOf
        System.out.println("valueOf(42.5): " + String.valueOf(42.5));
        System.out.println("copyValueOf: " + String.copyValueOf(new char[]{'J','a','v','a'}));

        // replaceAll and replaceFirst
        System.out.println("replaceAll(\"a\",\"@\"): " + txt.replaceAll("a","@"));
        System.out.println("replaceFirst(\"a\",\"@\"): " + txt.replaceFirst("a","@"));

        // split with limit
        String langs = "Java,Python,C++,Rust";
        String[] two = langs.split(",", 2);
        System.out.println("split with limit: " + Arrays.toString(two));

        //String
        String n="Denver";
        System.out.println(STR."Hello, \{n}!");
        // join with iterable
        String joined2 = String.join(" | ", Arrays.asList("API", "DB", "UI"));
        System.out.println("join(iterable): " + joined2);

        // lines() (Java 11+)
        String multi = "alpha\nbeta\r\ngamma";
        System.out.println("lines(): " + Arrays.toString(multi.lines().toArray()));

        // Unicode methods
        System.out.println("codePointAt(0): " + txt.codePointAt(0));
        System.out.println("codePointCount: " + txt.codePointCount(0, txt.length()));
        System.out.println("offsetByCodePoints(0,2): " + txt.offsetByCodePoints(0,2));

        // Locale-aware case
        System.out.println("toUpperCase(Locale.ROOT): " + txt.toUpperCase(Locale.ROOT));
        System.out.println("toLowerCase(Locale.ROOT): " + txt.toLowerCase(Locale.ROOT));

        // stripLeading/stripTrailing
        String spaced = "   padded   ";
        System.out.println("stripLeading(): '" + spaced.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + spaced.stripTrailing() + "'");

        // indent
        String block = "x\ny";
        System.out.println("indent(4):\n" + block.indent(4));

        // transform
        String shout = "whisper".transform(sx -> sx.toUpperCase(Locale.ROOT) + "!");
        System.out.println("transform(): " + shout);

        // translateEscapes
        String escaped = "Hello\\nWorld\\tTabbed";
        System.out.println("translateEscapes():\n" + escaped.translateEscapes());

        // subSequence
        System.out.println("subSequence(5,16): " + txt.subSequence(5,16));


        // =================== STRINGBUFFER FULL TOUR ===================
        StringBuffer sbuf = new StringBuffer("Mutable Buffer");
        System.out.println("start: " + sbuf);

        sbuf.setCharAt(0,'m');
        System.out.println("setCharAt: " + sbuf);

        sbuf.insert(7, " Ultra");
        System.out.println("insert: " + sbuf);

        sbuf.replace(0, 7, "Mega");
        System.out.println("replace: " + sbuf);

        sbuf.delete(4,10);
        System.out.println("delete: " + sbuf);

        sbuf.deleteCharAt(sbuf.length()-1);
        System.out.println("deleteCharAt: " + sbuf);

        System.out.println("indexOf(\"Buffer\"): " + sbuf.indexOf("Buffer"));
        System.out.println("substring(0,4): " + sbuf.substring(0,4));

        sbuf.setLength(4);
        System.out.println("setLength(4): " + sbuf);

        sbuf.ensureCapacity(64);
        System.out.println("capacity after ensure: " + sbuf.capacity());

        sbuf.trimToSize();
        System.out.println("capacity after trim: " + sbuf.capacity());


        // =================== STRINGBUILDER ===================
        StringBuilder sbd = new StringBuilder("Speed Builder");
        sbd.append(" ❤️").insert(5," Ultra").replace(0,5,"Turbo");
        System.out.println("chained ops: " + sbd);

        sbd.delete(5,11).deleteCharAt(0);
        System.out.println("delete+deleteCharAt: " + sbd);

        sbd.setCharAt(0,'t');
        System.out.println("setCharAt: " + sbd);

        System.out.println("indexOf(\"Builder\"): " + sbd.indexOf("Builder"));

        sbd.setLength(3);
        System.out.println("setLength(3): " + sbd);

        sbd.ensureCapacity(80);
        System.out.println("capacity after ensure: " + sbd.capacity());

        sbd.trimToSize();
        System.out.println("capacity after trim: " + sbd.capacity());

        // Building efficiently in loop
        StringBuilder sentence = new StringBuilder();
        for (int i=0;i<5;i++) sentence.append(i).append(":hi ");
        System.out.println("loop-built: " + sentence);

    }
}
/* 
Strings are Immutable

String in Java is thread-safe because it is immutable, 
allowing safe access by multiple threads without synchronization.

The String class in Java implements three important interfaces.
1. CharSequence: Allows access to characters in the string using charAt(), length(), etc.
2. Comparable<String>: Enables comparing two strings lexicographically using compareTo()
3. Serializable: Allows string objects to be converted into a byte stream

*/
