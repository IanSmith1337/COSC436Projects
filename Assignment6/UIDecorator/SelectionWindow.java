package Assignment6.UIDecorator;

import java.awt.*;
import javax.swing.*;

public class SelectionWindow implements UIElements {
    JFrame frame;
    JPanel base;
    JPanel text;
    JPanel buttonPanel;
    JLabel label;
    
    public SelectionWindow(JFrame frame, JPanel base, JPanel text, JPanel buttonPanel, JLabel label) {
        this.frame = frame;
        this.base = base;
        this.text = text;
        this.buttonPanel = buttonPanel;
        this.label = label;
    }

    @Override
    public void create() {
        frame.add(base);
        base.add(text);
        text.add(label);
        base.add(buttonPanel);
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        frame.setLocation(centerShiftedPoint);
        frame.setVisible(true);
    }
}
