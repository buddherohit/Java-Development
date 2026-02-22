public class Perimiter {
    int side;
    int area;
    int a;
    public int side(){
        return side*side;
    }
    public int area(){
        return 4* side;
    }
   public static void main(String[] args) {
    Perimiter per=new Perimiter();
    per.side=4;
    per.area=4;
    System.out.println(per.side);
    System.out.println(per.area());
   }
}
