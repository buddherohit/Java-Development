import java.io.*;
public class Dlete {
    public static void main(String[] args) {
        try{
File filedelete=new File("sample.txt");
System.out.println("File path: " + filedelete.getAbsolutePath());
System.out.println("File exists: " + filedelete.exists());
System.out.println("File is a directory: " + filedelete.isDirectory());
System.out.println("File name: " + filedelete.getName());
System.out.println(filedelete.length() + " bytes");
if(filedelete.delete()){
    System.out.println("File deleted successfully......");
    System.out.println("File name: " + filedelete.getName());
} 
else{
    System.out.println("Failed to delete the file.");
}
        }catch(Exception e){
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }
}
