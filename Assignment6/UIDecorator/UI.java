package Assignment6.UIDecorator;

import javax.swing.*;

import Assignment6.SystemInterface;

import java.awt.*;

public class UI {
        // TODO: The user interface should just be a text-based numbered list of options, implemented in the main method. (It can be a GUI if you desire and are familiar with the development of GUIs, but no extra points will be given for this).        
    public static void main(String[] args) {
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        UIElements buttons = new Buttons(buttonsPanel, new JButton("Display Menu"), new JButton("Submit Order"), new JButton("Display Tab"), SystemInterface.getMenu(), SystemInterface.getOrders(), SystemInterface.getTab());
        buttons.create();
        UIElements select = new SelectionWindow(new JFrame("Ordering Client V1.0"), new JPanel(new GridLayout(2, 0)), new JPanel(new FlowLayout()), buttonsPanel, new JLabel("Thanks for choosing Big Everything as your dining choice! How can we help you?"));
        select.create();
    }
}