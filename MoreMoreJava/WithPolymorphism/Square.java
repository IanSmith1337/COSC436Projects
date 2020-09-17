package MoreMoreJava.WithPolymorphism;

public class Square extends Shape{
    @Override
    public void setColor(String value) {
        super.color = value;
    }

    @Override
	public void setSize(String value) {
        super.size = value;
	}

    @Override
	public void setLocation(String value) {
        super.location = value;
    }
}
