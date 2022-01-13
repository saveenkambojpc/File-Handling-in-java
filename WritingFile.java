import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("sample1.txt");
            // FileWriter myWriter = new FileWriter("sample1.txt", true); //Append at last

            myWriter.write("This is Writing using java");
            myWriter.close();
            System.out.println("Successfully wrote");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}