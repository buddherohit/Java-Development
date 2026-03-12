public class TryCatch {
   public static void main(String[] args) {
    int a=4000;
    int b=0;
    try{
        int c=a/b;
        System.out.println(c);
    } catch(Exception e){
        System.out.println("Cannot divide the number ");
        System.out.println(e);
    }
    System.out.println("End of the program");
   } 
}
