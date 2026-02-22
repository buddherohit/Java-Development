public class methds {
    public static void main(String args[]){
    StringBuilder str1=new StringBuilder("Rohit");
      str1.replace(0, 5, "Manish");
    System.out.println(str1);
    String result=str1.toString();
    System.out.println(result);
    str1.capacity();
    System.out.println(str1.length()+str1.capacity());
}
    }
   