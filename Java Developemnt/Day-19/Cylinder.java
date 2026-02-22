public class Cylinder {
    private double Radius;
    private double Height;

    Cylinder(double Radius, double Height) {
        this.Radius = Radius;
        this.Height = Height;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double R) {
        Radius = R;

    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double H) {
        Height = H;
    }

    public double surfaceArea() {
        return 2 * Math.PI * Radius * Radius + 2 * Math.PI * Radius * Height;
    }

    public double volume() {
        return Math.PI * Radius * Radius * Height;
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(9, 12);
        c1.setHeight(12);
        c1.setRadius(9);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());

    }
}
