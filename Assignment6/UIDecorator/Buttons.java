package Assignment6.UIDecorator;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import Assignment6.*;
import Assignment6.Menu;
import Assignment6.MenuItem;
import Assignment6.CommandPattern.Classes.SystemInterface;

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
                UIElements mw = new MenuWindow(new JFrame("Ordering Client V1.0 - Menu Display"), new JPanel(new GridLayout(0, 1)));
                ((MenuWindow) mw).addText("Menu:");
                for (MenuItem item : menu.getMenu()) {
                    ((MenuWindow) mw).addText(item.getItemName() + "       " + item.getPrice());
                }
                mw.create();
                break;
            case "order":
                UIElements orderWindow = new OrderWindow(new JFrame("Ordering Client V1.0 - Order Display"), new JPanel(new GridLayout(0, 1)));
                ((OrderWindow) orderWindow).addButton("Add New Item", "Add");
                ((OrderWindow) orderWindow).addButton("Remove Last Item", "Undo");
                ((OrderWindow) orderWindow).addButton("Display Order", "Display");
                orderWindow.create();
                break;
            case "tab":
                double total = 0;
                UIElements tabw = new TabWindow(new JFrame("Ordering Client V1.0 - Tab Display"), new JPanel(new GridLayout(0, 1)), total);
                ((TabWindow) tabw).addText("Tab:");
                this.tab = new Tab(SystemInterface.getMenu(), SystemInterface.getOrders());
                for (MenuItem item : tab.getTab()) {
                    ((TabWindow) tabw).addText(item.toString());
                    total += item.getPrice();
                }
                ((TabWindow) tabw).setCost(total);
                ((TabWindow) tabw).addButton("Retrieve Check and Pay");
                tabw.create();
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
