package MoreMoreJava.PolymorphismExample;

public class Square extends Shape{
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
        return "Square Color: " + this.color + "\nSquare Size: " + this.size + "\nSquare Location: " + this.location;
    }
}
