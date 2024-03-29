package MoreMoreJava.PolymorphismExample;

public class Triangle extends Shape {
    private String color;
    private Boolean display = false;
    private String size;
    private String location;

    public void setColor(String value) {
        this.color = value;
    }

    public void setDisplay() {
        this.display = true;
    }

	public void setSize(String value) {
        this.size = value;
	}

	public void setLocation(String value) {
        this.location = value;
    }
    
    public String print() {
        return "Triangle Color: " + this.color + "\nTriangle Size: " + this.size + "\nTriangle Location: " + this.location;
    }
}