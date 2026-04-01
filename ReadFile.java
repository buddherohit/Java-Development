import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader r1=new FileReader("sample.txt");
            Scanner sc=new Scanner(r1);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }   

            int i;
            while((i=r1.read()) !=-1){
                System.out.print((char)i  );
            }
            r1.close();
        }catch(Exception e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
