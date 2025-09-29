import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) {

        try {
            // Create a FileOutputStream to write to "data.txt"
            FileOutputStream fos = new FileOutputStream("data.txt");

            // Wrap FileOutputStream with DataOutputStream to write primitive data types
            DataOutputStream dos = new DataOutputStream(fos);

            // Writing data to the file in binary format
            dos.writeInt(20);
            dos.writeDouble(99.75);
            dos.writeUTF("Hello World!");

            dos.close();

            // Create a FileInputStream to read from "data.txt"
            FileInputStream fis = new FileInputStream("data.txt");

            // Wrap FileInputStream with DataInputStream to read primitive data types
            DataInputStream dis = new DataInputStream(fis);

            // Reading data back in the same order it was written
            int number = dis.readInt();
            double price = dis.readDouble();
            String message = dis.readUTF();

            System.out.println("Integer: " + number);
            System.out.println("Double: " + price);
            System.out.println("String: " + message);

            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
