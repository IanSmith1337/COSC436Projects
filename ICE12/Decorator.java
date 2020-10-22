package ICE12;

public class Decorator implements Widget{

    private Widget widget;
    
    
    public Decorator(Widget w){

        this.widget = w ; 

    }

    @Override
    public void draw() {
        widget.draw();
    }


    
}
