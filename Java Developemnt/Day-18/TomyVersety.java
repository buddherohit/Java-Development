public class TomyVersety {
    String hitting;
    String Firing;
    String Runnign;
    public String hiitin(){
        System.out.println("Hiiting to a person now");
        return hitting;
    }
    public void Firring(){
        System.out.println("Firring start now");;
    }
    public void Runnig(){
        System.out.println("The Character is running");
    }
    public static void main(String[] args) {
        TomyVersety tomy=new TomyVersety();
        System.out.println(tomy.hiitin());
    }
}
