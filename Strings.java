class Main {
    public static void main(String[] args) {
        String a="John";
        String b=new String("Denver");
        System.out.println(a.length());
        System.out.println(a.charAt(1));
        System.out.println(a.concat(b));
        System.out.println(a+b);
        
        a="Ram";
        b="Ram";
        System.out.println("a.compareTo(b) "+ a.compareTo(b));
        a="Raam";
        System.out.println(a.compareTo(b)); //-12 beacuse this method subtracts unicode when it finds different element and return that value
        System.out.println(a==b);
        a="Ram";
        
        System.out.println("a==b works only for this above mentioned kind of String "+(a==b));
        String c=new String("John");
        String d=new String("John");
        System.out.println("is c==d "+(c==d));
        
        //Strings are immutable when you add something it creates new var at new location and starts pointing that variable
        a+=" Rajya";
        System.out.println("a after a+=\"Rajya\";"+ a);
        
        
        //StringBuffer->Makes string mutable
        StringBuffer s=new StringBuffer();
        System.out.println("s.capacity() "+s.capacity());    //Gives 16 buffer by default so not need to relocate frequently
        System.out.println("s.length() "+s.length());
        System.out.println("s.append(\"John\") "+s.append("John"));
        System.out.println("s.capacity() " +s.capacity());
        System.out.println("s.length() " +s.length());
        
        System.out.println("s.insert(4,\"y\") " +s.insert(4,"y"));
        System.out.println("s.ensureCapacity(20) " +s.ensureCapacity(20));
        System.out.println("s.delete(1,3) " +s.delete(1,3));
        System.out.println();
    }
}
