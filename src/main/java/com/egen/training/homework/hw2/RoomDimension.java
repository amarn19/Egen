package main.java.com.egen.training.homework.hw2;

public class RoomDimension {
    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {

        return this.length * this.width;

    }
    @Override
    public String toString() {
        return "RoomDimension [length:" + length + ", width" + width + "]";
    }
}
