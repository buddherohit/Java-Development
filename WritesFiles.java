import java.io.FileWriter;

public class WritesFiles {
    public static void main(String[] args) {
        try{
            FileWriter f1=new FileWriter("sample.txt");
            f1.write("Hello, this is a sample text.");
            f1.close();
            System.out.println("File written successfully.");

        }catch(Exception e){
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
