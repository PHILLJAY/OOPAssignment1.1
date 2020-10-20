public class Sphere {
    //numbers are initialised
    private final double pi = 3.14159;
    private double diameter = 0;

    //Sphere constructor class for doubles
    public Sphere(double rad) {
        diameter = rad;
    }

    //sphere constructor class for ints
    public Sphere(int rad) {
        diameter = (double) rad;
    }
    //Terrible
    //sets diameter of sphere using an int
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    //sets diameter of sphere using a double
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    //class to return volume of sphere
    double getVolume() {
        return (4 / 3) * pi * Math.pow(diameter, 3);
    }

    //class to return surface area of sphere
    double getSurfaceArea() {
        return 4 * pi * Math.pow(diameter, 2);
    }

    //class to return diameter of sphere
    double getDiameter() {
        return diameter;
    }

    //to string class
    @Override
    public String toString() {
        return
                "Surface Area = " + this.getSurfaceArea() +
                        ", volume = " + this.getVolume() +
                        ", diameter = " + this.getDiameter();
    }
}
