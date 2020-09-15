package MoreJava.Liskov;

public class LSPTest {



    public static void main(String[] args) {
        LSPTest lsp = new LSPTest();
        lsp.calculateArea(new Rectangle());
        lsp.calculateArea(new Square());
    }

    public void calculateArea(Object obj) {
        if(obj.getClass().toString().equals("class Rectangle")) {
            Rectangle o = (Rectangle) obj;
            o.setWidth(2);
            o.setLength(3);
            if(o.getArea() != 6) {
                System.err.println("Area is wrong: " + o.getArea());
            }
            if(o.getLength() != 3) {
                System.err.println("Length is wrong: " + o.getLength());
            }
            if(o.getWidth() != 2) {
                System.err.println("Width is wrong: " + o.getWidth());
            }
        } 
        if(obj.getClass().toString().equals("class Square")) {
            Square o = (Square) obj;
            o.setSideLength(3);
            if(o.getArea() != 9) {
                System.err.println("Area is wrong: " + o.getArea());
            }
            if(o.getSideLength() != 3) {
                System.err.println("Length is wrong: " + o.getSideLength());
            }
        }
    }
}
