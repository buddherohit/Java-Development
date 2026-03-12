public class Throws {
    
        public static int Add(int a, int b) throws ArithmeticException, NullPointerException {
            int result =a/b;
            return result;
        }
        public static void main(String[] args) {
            try {
                int c= Add(06, 00);
                System.out.println(c);
            } catch (Exception e) {
                System.out.println("Exception");
                System.out.println(e);
            }
        }
    }

