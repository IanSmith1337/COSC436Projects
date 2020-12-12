package Assignment6.UIDecorator;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import Assignment6.OrderItem;
import Assignment6.Orders;
import Assignment6.CommandPattern.Classes.SystemInterface;

public class OrderWindow implements ActionListener, UIElements {
    private JPanel base;
    private ArrayList<JLabel> orderLabels = new ArrayList<>();
    private ArrayList<JButton> buttons = new ArrayList<>();
    private JFrame frame;
    private JDialog jd;
    private JDialog jd2;
    private JTextField t;
    private JTextField t2;
    

    public OrderWindow(JFrame frame, JPanel base) {
        this.frame = frame;
        this.base = base;
    }

    public void addButton(String buttonText, String buttonCommand) {
        JButton b = new JButton(buttonText);
        b.addActionListener(this);
        b.setActionCommand(buttonCommand);
        this.buttons.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action.toLowerCase()) {
            case "add":
                saveStateEmptyCheck();
                createJDialog1();
                break;
            case "undo":
                createJDialog2();
                break;
            case "display":
                displayStuff();
                break;
            case "submit":
                addNewItemToOrder();
                jd.dispose();
                break;
            case "submit2":
                UI.origin.restoreOrderFromMemento(UI.savedStates.get((UI.savedStates.size()-1)-Integer.parseInt(t2.getText())));
                jd2.dispose();
                break;
            default:
                break;
        }
    }

    private void addNewItemToOrder() {
        int number = Integer.parseInt(t.getText());
        OrderItem item = new OrderItem(number);
        Orders order = new Orders();
        for (OrderItem oi : UI.origin.getOrders().getOrder()) {
            order.addItems(oi);
        }
        order.addItems(item);
        UI.origin.setOrder(order);
        UI.savedStates.add(UI.origin.saveOrderToMemento());
    }

    private void displayStuff() {
        frame.setVisible(false);
        base.removeAll();
        orderLabels.clear();
        for (JButton button : buttons) {
            base.add(button);
        }
        for (OrderItem item : UI.origin.getOrders().getOrder()) {
            JLabel description = new JLabel(SystemInterface.getMenu().getItem(item.getItemNumber()).toString());
            orderLabels.add(description);
        }
        for (JLabel jLabel : orderLabels) {
            JPanel text = new JPanel(new FlowLayout());
            text.add(jLabel);
            base.add(text);
        }
        frame.validate();
        frame.repaint();
        frame.pack();
        frame.setVisible(true);
    }

    private void saveStateEmptyCheck() {
        if(UI.savedStates.isEmpty()){
            UI.origin.setOrder(new Orders());
            UI.savedStates.add(UI.origin.saveOrderToMemento());
        }
    }

    private void createJDialog2() {
        jd2 = new JDialog(frame, "How many items to remove?", true);
        jd2.setLayout(new FlowLayout());
        JButton submit2 = new JButton("Submit");
        submit2.addActionListener(this);
        submit2.setActionCommand("submit2");
        t2 = new JTextField();
        t2.setColumns(3);
        JLabel l2 = new JLabel("Enter items to remove: ");
        jd2.add(l2);
        jd2.add(t2);
        jd2.add(submit2);
        GraphicsEnvironment graphics2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint2 = graphics2.getCenterPoint();
        jd2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jd2.pack();
        centerShiftedPoint2.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        jd2.setLocation(centerShiftedPoint2);
        jd2.setVisible(true);
    }

    private void createJDialog1() {
        jd = new JDialog(frame, "Enter Item Number", true);
        jd.setLayout(new FlowLayout());
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setActionCommand("submit");
        t = new JTextField();
        t.setColumns(3);
        JLabel l = new JLabel("Enter item number: ");
        jd.add(l);
        jd.add(t);
        jd.add(submit);
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jd.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        jd.setLocation(centerShiftedPoint);
        jd.setVisible(true);
    }

    public void create(){
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerShiftedPoint = graphics.getCenterPoint();
        frame.add(base);
        for (JButton button : buttons) {
            base.add(button);
        }
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        centerShiftedPoint.translate(-(frame.getWidth()/2), -(frame.getHeight()/2));
        frame.setLocation(centerShiftedPoint);
        frame.setVisible(true);
    }
}