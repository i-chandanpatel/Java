import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Denver");
        names.add("Alex");
        names.add("Riya");
        names.add("Sam");

        // 1. Normal for loop (Index-based)
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2. Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // Logic: We are creating a "throwaway" class right inside the method call.
        // We manually override the 'accept' method. This is the most verbose way
        // to use forEach, as it defines the entire object structure on the spot.
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 3. Explicit Consumer Variable
        // Logic: Similar to the screenshot, but we store the Consumer in a variable 
        // first. This makes the logic reusable for other lists if needed.
        Consumer<String> nameConsumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        names.forEach(nameConsumer);

        // 4. Lambda with Explicit Type
        // Logic: The "Modern" version of the screenshot code. Java removes the 
        // "new Consumer" and "@Override" boilerplate and keeps just the parameters.
        names.forEach((String name) -> {
            System.out.println(name);
        });

        // 5. Lambda with Inferred Type
        names.forEach(name -> System.out.println(name));

        // 6. Method Reference
        names.forEach(System.out::println);
    }
}
