package Assignment6.UIDecorator;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class TabWindow implements ActionListener, UIElements {
    private JPanel base;
    private ArrayList<JLabel> labels = new ArrayList<>();
    private ArrayList<JButton> buttons = new ArrayList<>();
    private JFrame frame;
    private double cost;

    public TabWindow(JFrame frame, JPanel base, double cost) {
        this.frame = frame;
        this.base = base;
        this.cost = cost;
    }

    public void addText(String input) {
        JLabel label = new JLabel(input);
        this.labels.add(label);
    }

    public void addButton(String buttonText) {
        JButton b = new JButton(buttonText);
        b.addActionListener(this);
        this.buttons.add(b);
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
        for (JButton button : buttons) {
            base.add(button);
        }
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        frame.setLocation(centerShiftedPoint);
        frame.setVisible(true);
    }

    public void createTotalDisplay(double cost) {
        JDialog jd = new JDialog(frame, "Enter Item Number", true);
        jd.setLayout(new FlowLayout());
        JLabel l = new JLabel("Total: ");
        jd.add(l);
        JLabel p = new JLabel(String.valueOf(cost));
        jd.add(p);
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jd.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        jd.setLocation(centerShiftedPoint);
        jd.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       createTotalDisplay(cost);
    }

	public void setCost(double cost) {
        this.cost = cost;
	}
}