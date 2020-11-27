package Assignment6;
import javax.swing.*;
import java.awt.*;

public class UI {
        // TODO: The user interface should just be a text-based numbered list of options, implemented in the main method. (It can be a GUI if you desire and are familiar with the development of GUIs, but no extra points will be given for this).        
    public static void main(String[] args){
        JPanel base = new JPanel(new GridLayout(2, 0));
        JPanel text = new JPanel(new FlowLayout());
        JPanel buttons = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Thanks for choosing Big Everything as your dining choice! How can we help you?");
        text.add(label);
        ActionButton b1 = new ActionButton("menu", SystemInterface.getMenu());
        ActionButton b2 = new ActionButton("order", SystemInterface.getOrder());
        ActionButton b3 = new ActionButton("tab", SystemInterface.getTab());
        buttons.add(b1.getButton());
        buttons.add(b2.getButton());
        buttons.add(b3.getButton());
        JFrame frame = new JFrame("Ordering Client V1.0");
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        frame.add(base);
        base.add(text);
        base.add(buttons);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        frame.setLocation(centerShiftedPoint);
        frame.setVisible(true);
    }
}