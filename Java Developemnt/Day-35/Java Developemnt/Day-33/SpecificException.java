import java.util.Scanner;
public class SpecificException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks=new int[3];
        marks[0]=10;
        marks[1]=0;
        marks[2]=30;
        boolean flag=true;
        while(flag){
                System.out.println("Enter the index of the array");
                int index = sc.nextInt();
                System.out.println("Enter the number you want to divide");
                int number =sc.nextInt();
                try{
                    System.out.println("The value of array index is"+ marks[index]);
                    System.out.println("The value of number divided by array index is"+ number/marks[index]);
    
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index is out of bound");
                    System.out.println(e);
                }
                catch(ArithmeticException e){
                    flag=false;
                    System.out.println("Cannot divide by the num zero");
                    System.out.println(e);
                }
                catch(Exception e){
                    System.out.println("Other exception occur ");
                    System.out.println(e);
                }
        }
        System.out.println("Enter the index of the array");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide");
        int number =sc.nextInt();
        try{
            System.out.println("The value of array index is"+ marks[index]);
            System.out.println("The value of number divided by array index is"+ number/marks[index]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bound");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            flag=false;
            System.out.println("Cannot divide by the num zero");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Other exception occur ");
            System.out.println(e);
        }
    }
}
