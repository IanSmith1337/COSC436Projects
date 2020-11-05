package ICE16;

public class LineAdapter implements Shape {
    private Line adaptee = new Line();
    
    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    public void draw(int x, int y, int z, int j) {
        adaptee.draw(x, y, z, j);
    }
    
}


//In LineAdapter, create an instance variable for Line, name it adaptee.

//The constructor of LineAdapter should accept a parameter of Line class, and assign it to the instance variable adaptee.

//Implement the draw( … ) function by calling the original draw function in Line class.