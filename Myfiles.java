import java.io.*;
public class Myfiles {
    public static void main(String[] args) {
        File filewrite=new File("Index.txt");
        try{
            filewrite.createNewFile();
            System.out.println("File created successfully.");
            FileWriter writer=new FileWriter(filewrite);
            writer.write("Hello, this is a sample text.");
            writer.close();
        }catch(IOException e){
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
        
        try{
            FileReader fileread=new FileReader("Index.txt");
            int i;
            while((i=fileread.read())!=-1){
                System.out.print((char)i);
            }
            fileread.close();
        }catch(IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}
