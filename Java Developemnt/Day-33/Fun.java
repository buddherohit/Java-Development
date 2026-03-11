public class Fun {
    public static int greet(){
      try{
        int a=10;
        int b=2;
        int c=a/b;
        return c;
      }
      catch(Exception e){
       System.out.println(e);
       
      }
      finally{
        System.out.println("This block will always execute.");
        
      }
        return 2;
    }
    public static void main(String[] args) {
        int result=greet();
        System.out.println("Result: " + result);
        int a=7;
        int b=9;
        while (true) {
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("This block will always execute b=" + b + ".");
            }
            b--;
        }
    }
}
