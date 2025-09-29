import java.io.*;
import java.util.*;

class InputStream {
    public static void main(String[] args) {
        String fileName = null;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter file name");
            
            // Read the file name entered by the user
            fileName = sc.next();

            // Create a BufferedReader to read from the specified file
            BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
            
            String line = null;   // Variable to store the first line of the file

            // Read the first line from the file
            line = inputStream.readLine();

            // Display the file name and the first line read
            System.out.println("The first line in " + fileName + " is");
            System.out.println(line);

            // Close the BufferedReader to free resources
            inputStream.close();
        } catch (FileNotFoundException f) {
            System.out.println("File " + fileName + " not found");
        } catch (IOException io) {
            System.out.println("Error reading from file " + fileName);
        }
    }
}
