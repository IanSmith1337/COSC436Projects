package MoreMoreJava.WithPolymorphism;


public class Shape {

    protected String color;
    protected String size;
    protected String location;

	public String print() {
		return "Shape: " + this.getClass().toString() + "\nColor: " + this.color + "\nSize: " + this.size + "\nLocation: " + this.location;
	}

	public void setColor(String value) {
	}

	public void setSize(String value) {
	}

	public void setLocation(String value) {
    }
    
}