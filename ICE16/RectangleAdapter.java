package ICE16;

public class RectangleAdapter implements Shape{
    private Rectangle adaptee;
    
    public RectangleAdapter(Rectangle rect) {
        this.adaptee = rect;
    }

    public void draw(int x, int y, int z, int j) {
        adaptee.draw(x, y, Math.abs(x-z), Math.abs(y-j));
    }
    
}


//In LineAdapter, create an instance variable for Line, name it adaptee.

//The constructor of LineAdapter should accept a parameter of Line class, and assign it to the instance variable adaptee.

//Implement the draw( … ) function by calling the original draw function in Line class.public class LineAdapter implements Shape{