package Assignment6.UIDecorator;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
public class MenuWindow implements UIElements {
    private JPanel base;
    private ArrayList<JLabel> labels = new ArrayList<>();
    private JFrame frame;

    public MenuWindow(JFrame frame, JPanel base) {
        this.frame = frame;
        this.base = base;
    }

    public void addText(String input) {
        JLabel label = new JLabel(input);
        this.labels.add(label);
    }

    public void create(){
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