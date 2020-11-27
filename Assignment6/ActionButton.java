package Assignment6;

import java.awt.event.*;
import javax.swing.*;

public class ActionButton implements ActionListener {
    JButton b;
    Menu menu;

    public ActionButton(String type, Object supplementaryObject){
        if(type.equalsIgnoreCase("menu")) {
            b = new JButton("Display Menu");
            b.addActionListener(this);
            b.setActionCommand("Menu");
            this.menu = (Menu) supplementaryObject;
        }

        if(type.equalsIgnoreCase("order")) {
            b = new JButton("Submit Order");
            b.addActionListener(this);
            b.setActionCommand("Order");
        }

        if(type.equalsIgnoreCase("tab")) {
            b = new JButton("Display Tab");
            b.addActionListener(this);
            b.setActionCommand("Tab");
        }
    }

    public JButton getButton() {
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Menu")){
            MenuWindow w = new MenuWindow();
            w.addText("Menu:");
            for (MenuItem item : menu.getMenu()) {
                w.addText(item.getItemName() + "       " + item.getPrice());
            }
            w.make();
        } 
        
        if(e.getActionCommand().equalsIgnoreCase("Order")){
            System.out.println("Button 2 Not Implemented Yet.");
        }

        if(e.getActionCommand().equalsIgnoreCase("Tab")){
            System.out.println("Button 3 Not Implemented Yet.");
        }
    }
}
