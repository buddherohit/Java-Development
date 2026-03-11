import java.util.*;

class Demo{
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.add("Typescript");
        list.add("Go");
        list.add("Rust");

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}