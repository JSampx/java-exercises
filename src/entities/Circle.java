package entities;

public class Circle extends Shape implements area{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
