class StaticMethod{
    static int c=5; //Shared by all methods if changes made by one method will reflect for every method
    public String add(int a, int b){
        return ("Sum is "+(a+b)+" and the value of c for this method is also become "+c);
    }
    public static int divide(int a, int b){
        System.out.println("c incremented in divide method from "+c+" to "+(++c));
        return (a/b);
    }
}
class Main {
    public static void main(String[] args) {
        //to calling static method not required class object we can call them using ClassName
        System.out.println("Output of divide method "+StaticMethod.divide(8,2));
        
        //Need object of Class which is not static
        StaticMethod s=new StaticMethod();
        System.out.println(s.add(8,2));
    }
}
