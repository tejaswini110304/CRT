import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
FileOutputStream fos = new FileOutputStream("C://Users//sscha//Desktop//new-java//Streams_Java//file3.txt");
            String data = "This is a Byte Stream Example in Java Streams."; 
            //-> 10010101  010101000
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Writing to the file is completed. Now iam reading. ");

            // Reading from a file
            FileInputStream fis = new FileInputStream("C://Users//sscha//Desktop//new-java//Streams_Java//file3.txt");
            int i;
            System.out.println("The contents of file : ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
