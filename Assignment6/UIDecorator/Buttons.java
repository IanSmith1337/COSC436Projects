package Assignment6.UIDecorator;

import java.awt.event.*;
import javax.swing.*;

import Assignment6.*;
import Assignment6.Factory.*;

public class Buttons implements ActionListener, UIElements {
    JPanel panel;
    JButton b1;
    JButton b2;
    JButton b3;
    Menu menu;
    Orders orders;
    Tab tab;

    public Buttons(JPanel p, JButton b1, JButton b2, JButton b3, Menu m, Orders o, Tab t) {
        this.panel = p;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.menu = m;
        this.orders = o;
        this.tab = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch(action.toLowerCase()) {
            case "menu":
                MenuWindow w = new MenuWindow();
                w.addText("Menu:");
                for (MenuItem item : menu.getMenu()) {
                    w.addText(item.getItemName() + "       " + item.getPrice());
                }
                w.make();
                break;
            case "order":
                break;
            case "tab":
                break;
            default:
                break;
        }
    }

    @Override
    public void create() {
        b1.addActionListener(this);
        b1.setActionCommand("Menu");
        panel.add(b1);
        b2.addActionListener(this);
        b2.setActionCommand("Order");
        panel.add(b2);
        b3.addActionListener(this);
        b3.setActionCommand("Tab");
        panel.add(b3);
    }
}
