//repeate problem
public class RecordDemo {
    record Bike(String brand, int speed){ }
    public static void main(String[] args) {
        Bike b=new Bike("Hero","200");
        System.out.println(b.speed());  
        System.out.println(b.brand());
        System.out.println(b);  //Bike[brand=Hero, speed=200]
        //Record Provides getter, constructor and toString and resolves the file issue to repetetion of getters & constructors 
    }
}
