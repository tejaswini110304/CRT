import java.io.*;
public class DeserializationExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileInputStream to read from the file
            FileInputStream fileIn = new FileInputStream("C://Users//sscha//Desktop//new-java//SE-DSE//student_example.ser");

            // Step 2: Create an ObjectInputStream to read the object
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Step 3: Read the object from the file
            Student student2 = (Student) objectIn.readObject();

            // Step 4: Close streams
            objectIn.close();
            fileIn.close();

            // Step 5: Display the deserialized object
            System.out.println("Deserialization Successful! Loaded Object:");
            student2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
