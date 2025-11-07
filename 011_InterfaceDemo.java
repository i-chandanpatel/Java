import java.util.List;

// Vehicle interface: defines contract for all vehicles
interface Vehicle {
    void start();   // Abstract: every vehicle must implement start
    void stop();    // Abstract: every vehicle must implement stop

    // Default method: common behavior, can be overridden
    default void acceleration() {
        System.out.println("Vehicle is accelerating...");
    }

    // Static method: general info
    static void vehicleInfo() {
        System.out.println("Vehicles are used for transportation.");
    }
}

// Rechargeable interface: for electric vehicles
interface Rechargeable {
    void recharge();
}

// Car class
class Car implements Vehicle {
    public void start() { System.out.println("Car is starting with key ignition."); }
    public void stop() { System.out.println("Car is stopping using brakes."); }
    public void acceleration() { System.out.println("Car is accelerating fast!"); }
}

// Bike class
class Bike implements Vehicle {
    public void start() { System.out.println("Bike is starting with kick start."); }
    public void stop() { System.out.println("Bike is stopping using brakes."); }
}

// ElectricCar class: Vehicle + Rechargeable
class ElectricCar implements Vehicle, Rechargeable {
    public void start() { System.out.println("Electric Car is starting silently."); }
    public void stop() { System.out.println("Electric Car is stopping with regenerative brakes."); }
    public void acceleration() { System.out.println("Electric Car is accelerating instantly!"); }
    public void recharge() { System.out.println("Electric Car is recharging its battery."); }
}

// Demo class
public class InterfaceDemo {
    public static void main(String[] args) {

        Vehicle.vehicleInfo();
        System.out.println();

        // Polymorphism: using Vehicle references
        List<Vehicle> vehicles = List.of(new Car(), new Bike(), new ElectricCar());
        for (Vehicle v : vehicles) {
            v.start();
            v.acceleration();
            v.stop();
            System.out.println();
        }

        // Rechargeable interface
        Rechargeable ev = new ElectricCar();
        ev.recharge();
    }
}
