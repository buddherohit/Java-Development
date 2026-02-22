
class Phones {
    public void Call() {
        System.out.println("Calling to peoples");
    }
}

class Smartphones extends Phones {
    public void touchScreen() {
        System.out.println("Use of touch screen");
    }
}

class Camera extends Smartphones {
    public void Camrera() {
        System.out.println("Capture images of peopels");
    }
}

class mobiles extends Phones {
    public void keybord() {
        System.out.println("Press a keys");
    }
}

public class main {
    public static void main(String[] args) {
        Smartphones s1 = new Smartphones();
        System.out.println("Calling to smartphones class with phones class property");
        s1.Call();
        s1.touchScreen();

        Camera c1 = new Camera();
        System.out.println("Use smartphones and phones class property");
        c1.Call();
        c1.Camrera();
        c1.touchScreen();

        Phones p1 = new Phones();
        System.out.println("use phones class property");
        p1.Call();
    
        

    }
}