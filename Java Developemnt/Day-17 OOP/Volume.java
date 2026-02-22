 class Volume {
    double width;
    double height;
    double depth;
    public void Details(){
        System.out.println("The volume is");
    }
    
}
class Box{
    public static void main(String[] args) {
       Volume myBox=new Volume();
        double vol;
        myBox.width=10;
        myBox.height=20;
        myBox.depth=15;
        vol=myBox.depth*myBox.height*myBox.width;
        System.out.println("The volume is"+ vol);
    }
}