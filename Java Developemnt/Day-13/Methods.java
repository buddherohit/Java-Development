public class Methods {
    public static void main(String args[]){
        String name="Hello,  . ; world";
        String str=("Hello world"+ name.length());
        int length=name.length();
        System.out.println("Length of string is:"+ length);
        System.out.println(name.charAt(8));
        System.out.println(name.substring(0,8));
        String triem="      Today is great day     ";
        System.out.println(triem.trim());
        System.out.println(triem);
        System.out.println(name.replace('e', 'a'));
        System.out.println(name.replace("world", "Rohit"));
        System.out.println(name.replace("w","abc"));
        System.out.println(name.startsWith("Hel"));
        System.out.println(name.startsWith("eHllo"));
        System.out.println(name.endsWith("world"));
        System.out.println(name.endsWith("rld"));
        System.out.println(name.endsWith("ldr"));

        String arrays= "Arrrry";
        System.out.println(arrays.indexOf('r'));
        System.out.println(arrays.indexOf("rry"));
        System.out.println(arrays.indexOf("rrrrrry"));
        System.out.println(name.indexOf("rrrrr"));
        System.out.println(arrays.lastIndexOf("yrr"));
        System.out.println(arrays.lastIndexOf("yA"));
        String returns="Haryyyrrry";
        System.out.println(returns.lastIndexOf("rr"));
        System.out.println(returns.lastIndexOf("rr",6));
        String name3="Rohit";
        System.out.println(name3.equals("Rohit"));
        System.out.println(name3.equalsIgnoreCase("RohIt"));
        System.out.println(name3.contains("R"));
        System.out.println(name3.contains("ro"));
        System.out.println(name3.isEmpty());
        String programs = "java  python c++ js";
        String[] words=programs.split(" ");
        String a="Rohit";
        String b="Rohit";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
    }
    
}
