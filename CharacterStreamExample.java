import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to a file using FileWriter
            FileWriter writer = new FileWriter("C://Users//sscha//Desktop//new-java//Streams_Java//file4.txt");
            writer.write("This is a Character Stream Example in Java Streams.");
            writer.close();
            System.out.println("Writing to the file is completed. Now iam reading. ");
            // Reading from a file using FileReader
            FileReader reader = new FileReader("C://Users//sscha//Desktop//new-java//Streams_Java//file4.txt");
            int ch;
            System.out.println("The contents of file : ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
