package MoreJava.Liskov;

public class Square {
    private int length;
    private int width;

    public void setSideLength(int length) {
        this.width = length;
        this.length = length;
    }

    public int getSideLength() {
        return length;
    }

    public int getArea() {
        return length * width;
    }
}
