class StaticMethod{
    public int add(int a, int b){
        return (a+b);
    }
    public static int divide(int a, int b){
        return (a/b);
    }
}
public class Static {
    public static void main(String[] args) {
        //For calling static method we do not required class object we can call them using ClassName directly
        System.out.println(StaticMethod.divide(8,2));
        
        //Need object of Class which is not static
        StaticMethod s=new StaticMethod();
        System.out.println(s.add(8,2));
    }
}
