package Assignment6;
import javax.swing.*;
import java.awt.*;

public class UI {
        // TODO: The user interface should just be a text-based numbered list of options, implemented in the main method. (It can be a GUI if you desire and are familiar with the development of GUIs, but no extra points will be given for this).        
    public static void main(String[] args){
       JPanel base = new JPanel(new GridLayout(2, 0));
       JPanel text = new JPanel(new FlowLayout());
       JPanel buttons = new JPanel(new FlowLayout());
       JLabel label = new JLabel("Thanks for choosing Big Salad as your dining choice! How can we help you?");
       text.add(label);
       JButton b1 = new JButton("Option 1");
       JButton b2 = new JButton("Option 2");
       JButton b3 = new JButton("Option 3");
       buttons.add(b1);
       buttons.add(b2);
       buttons.add(b3);
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