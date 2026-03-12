// ── Custom Exception (checked) ───────────────────────────────
// This is a USER-DEFINED exception.
// It extends Exception → therefore it becomes a CHECKED exception.
// Meaning: the compiler forces us to either catch it or declare it with "throws".
class InsufficientFundsException extends Exception {

    // Stores how much money is missing
    private double amount;

    // Constructor receives the missing amount
    public InsufficientFundsException(double amount) {

        // super(...) sends the message to the parent Exception class
        // This message will be available via e.getMessage()
        super(String.format("Insufficient funds: need %.2f more", amount));

        this.amount = amount;
    }

    // Getter so callers can know the shortfall amount
    public double getAmount() { 
        return amount; 
    }
}


// ============================================================
// Main demonstration class for Java Exception concepts
public class ExceptionDemo {

    static void exceptionCatalogue() {

        // ════════════════════════════════════════════════════
        //  UNCHECKED EXCEPTIONS  (extend RuntimeException)
        //
        //  Compiler does NOT force handling.
        //  These usually indicate programming mistakes.
        //
        //  Example: accessing invalid memory, wrong casts, etc.
        // ════════════════════════════════════════════════════

        // ── NullPointerException
        //    Happens when we try to use a reference that points to null.
        //    e.g.  String s = null;  s.length();

        // ── ArrayIndexOutOfBoundsException
        //    Accessing array index outside valid range.
        //    e.g.  int[] a = {1,2,3};  int x = a[5];

        // ── StringIndexOutOfBoundsException
        //    String index outside valid range.
        //    e.g.  "hi".charAt(10);

        // ── ClassCastException
        //    Trying to cast incompatible types.
        //    e.g.  Object o = "hello";  Integer i = (Integer) o;

        // ── NumberFormatException
        //    Parsing invalid number text.
        //    e.g.  Integer.parseInt("abc");

        // ── ArithmeticException
        //    Arithmetic errors.
        //    e.g.  int r = 10 / 0;

        // ── IllegalArgumentException
        //    Method received an invalid argument.
        //    e.g.  Thread.sleep(-1);

        // ── IllegalStateException
        //    Method called at wrong time.
        //    e.g.  iterator.remove() before iterator.next();

        // ── StackOverflowError
        //    Infinite recursion → stack memory exhausted.
        //    (Technically Error, but behaves like unchecked.)

        // ── OutOfMemoryError
        //    JVM heap memory exhausted.

        // ── ConcurrentModificationException
        //    Collection modified while iterating.

        // ── UnsupportedOperationException
        //    Operation not supported by object.
        //    e.g.  Collections.unmodifiableList(...).add(x);

        // ── IndexOutOfBoundsException
        //    Parent class of index-related exceptions.

        // ── NegativeArraySizeException
        //    Creating array with negative size.

        // ════════════════════════════════════════════════════
        //  CHECKED EXCEPTIONS
        //
        //  Compiler FORCES handling (catch or throws).
        //  Usually represent recoverable conditions.
        // ════════════════════════════════════════════════════

        // ── IOException
        //    Generic input/output failure.

        // ── FileNotFoundException
        //    File path does not exist.

        // ── EOFException
        //    Unexpected end of file.

        // ── SQLException
        //    Database access error.

        // ── ClassNotFoundException
        //    Class loader cannot find requested class.

        // ── CloneNotSupportedException
        //    clone() used on object that does not implement Cloneable.

        // ── InterruptedException
        //    Thread interrupted during sleep/wait.

        // ── ParseException
        //    Parsing failure (dates, numbers etc.)

        // ── MalformedURLException
        //    URL string invalid.

        // ── InvocationTargetException
        //    Reflection method threw exception.

        // ── InstantiationException
        //    Cannot instantiate abstract class/interface.

        // ── NoSuchMethodException
        //    Method not found via reflection.

        // ── NoSuchFieldException
        //    Field not found via reflection.

        System.out.println("[exceptionCatalogue] Catalogue printed — see source comments.");
    }


    
    static void tryCatchFinallyDemo() {
        
        // Different values to trigger different exceptions
        String[] data = {"42", "hello", null, "7"};

        for (String item : data) {

            System.out.println("\n-- Processing: " + item);

            try {

                // parseInt may throw:
                // NumberFormatException OR NullPointerException
                int value = Integer.parseInt(item);

                // ArithmeticException possible if value = 0
                int result = 100 / value;

                System.out.println("   Result of 100 / " + value + " = " + result);

            } catch (NullPointerException e) { 

                System.out.println("   [CATCH] NullPointerException: item was null → " + e.getMessage());

            } catch (NumberFormatException e) {

                System.out.println("   [CATCH] NumberFormatException: '" + item + "' is not a number → " + e.getMessage());

            } catch (ArithmeticException e) {

                System.out.println("   [CATCH] ArithmeticException: " + e.getMessage());

            } catch (Exception e) {

                // Generic fallback catch
                // Should normally be placed LAST
                System.out.println("   [CATCH] Unexpected exception: " + e.getMessage());

            } finally {

                // FINALLY always runs
                // Even if exception occurred
                // Often used for closing files/resources
                System.out.println("   [FINALLY] Clean-up executed for item: " + item);
            }
        }
    }


   
    /**
     * Simulates a bank withdrawal.
     *
     * Important concept:
     * This method THROWS the exception but does NOT catch it.
     * Responsibility moves to the caller.
     */
    static void withdraw(double balance, double amount)
            throws InsufficientFundsException {

        System.out.println("\n[withdraw] Attempting to withdraw " + amount
                + " from balance " + balance);

        if (amount > balance) {

            // Calculate how much money is missing
            double shortfall = amount - balance;

            // Throw custom exception object
            throw new InsufficientFundsException(shortfall);
        }

        System.out.println("[withdraw] Withdrawal successful. Remaining: " + (balance - amount));
    }


    
    // Demonstrates exception PROPAGATION
    // This method also does not catch the exception.
    static void processTransaction(double balance, double amount)
            throws InsufficientFundsException {

        System.out.println("[processTransaction] Initiating transaction...");

        // If withdraw throws exception,
        // it propagates to whoever called this function
        withdraw(balance, amount);

        System.out.println("[processTransaction] Transaction completed.");
    }


    
    /**
     * Higher level service layer.
     * Again propagates the exception.
     */
    static void executePayment(double balance, double amount)
            throws InsufficientFundsException {

        System.out.println("[executePayment] Starting payment flow...");

        // Exception chain if thrown:
        // withdraw → processTransaction → executePayment → main
        processTransaction(balance, amount);

        System.out.println("[executePayment] Payment flow done.");
    }


    
    public static void main(String[] args) {

        // 1) Show exception catalogue
        exceptionCatalogue();

        // 2) Demonstrate try-catch-finally behaviour
        tryCatchFinallyDemo();

        // 3) Custom exception propagation demo
        System.out.println("\n=== Custom Exception Propagation Demo ===");

        // ── Scenario A: enough balance
        System.out.println("\n-- Scenario A: sufficient funds");

        try {

            executePayment(500.00, 200.00);

            System.out.println("[main] Payment completed successfully.");

        } catch (InsufficientFundsException e) {

            System.out.println("[main][CATCH] Payment failed → " + e.getMessage());
            System.out.println("[main]        Shortfall amount: " + e.getAmount());

        } finally {

            System.out.println("[main][FINALLY] Scenario A clean-up done.");
        }

        // ── Scenario B: insufficient balance
        System.out.println("\n-- Scenario B: insufficient funds");

        try {

            // This will trigger the custom exception
            executePayment(100.00, 750.00);

            System.out.println("[main] This line is never reached.");

        } catch (InsufficientFundsException e) {

            // Exception propagated from lower layers
            System.out.println("[main][CATCH] Payment failed → " + e.getMessage());
            System.out.println("[main]        Shortfall amount: " + e.getAmount());

        } finally {

            System.out.println("[main][FINALLY] Scenario B clean-up done.");
        }

        System.out.println("\n=== All demos complete ===");
    }
}