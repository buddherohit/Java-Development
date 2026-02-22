public class SelfPhone {
    String Ringing;
    String Vibrating;
    public String Ringing(){
        return Ringing;
    }
    public String Vibratin(){
        return Vibrating;
    }
    
    public static void main(String args[]){
        SelfPhone sp=new SelfPhone();
        sp.Ringing="The phoen is ringing now";
        sp.Vibrating="The phoen is vibrating";
         System.out.println(sp.Ringing());
        System.out.println(sp.Vibratin());
    }
}
