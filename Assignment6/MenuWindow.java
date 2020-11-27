package Assignment6;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
public class MenuWindow {
    private JPanel base;
    private ArrayList<JLabel> labels = new ArrayList<>();

    public MenuWindow(){
        this.base = new JPanel(new GridLayout(0, 1));
    }

    public void addText(String input) {
        JLabel label = new JLabel(input);
        this.labels.add(label);
    }

    public void make(){
        JFrame frame = new JFrame("Ordering Client V1.0 - Menu Display");
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        frame.add(base);
        for (JLabel jLabel : labels) {
            JPanel text = new JPanel(new FlowLayout());
            text.add(jLabel);
            base.add(text);
        }
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        frame.setLocation(centerShiftedPoint);
        frame.setVisible(true);
    }
}