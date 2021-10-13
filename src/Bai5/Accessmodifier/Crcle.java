package Bai5.Accessmodifier;

public class Crcle {
    private double radius;
    private String color = "red";

    public Crcle(double radius) {
        this.radius = 1.0;
    }

    public Crcle() {
    }


    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return this.radius * this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Crcle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
