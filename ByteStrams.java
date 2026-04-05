import java.io.*;
public class ByteStrams {
public static void main(String[] args) throws IOException{
    try {
        FileInputStream fin=new FileInputStream("Input.txt");
    FileOutputStream fout=new FileOutputStream("Output.txt");
    int i;
    while((i=fin.read())!=-1){
        fout.write(i);
    }
    fin.close();
    fout.close();
    System.out.println("File copied successfully.");
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}
}

    