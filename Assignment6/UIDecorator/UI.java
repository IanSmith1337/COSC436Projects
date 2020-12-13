package Assignment6.UIDecorator;

/*

Assignment 6: Big Everything by Melissa Trick, Prabhat Thapa and Ian Smith.

How the program works:
We implemented the command design to retrieve the menu, tab, and order, and assign them to a button. The memento pattern was used for order saving and item reversion.
The decorator pattern was used for the windows to help design them and to make the process easier.

Thanks for an awesome semester! :D

*/

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Assignment6.CommandPattern.Classes.SystemInterface;
import Assignment6.Memento.Originator;

public class UI {
    public static List<Assignment6.Memento.Originator.Memento> savedStates = new ArrayList<>();
    public static final Originator origin = new Originator();
    public static void main(String[] args) {
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        UIElements buttons = new Buttons(buttonsPanel, new JButton("Display Menu"), new JButton("Submit Order"), new JButton("Display Tab"), SystemInterface.getMenu(), SystemInterface.getOrders(), SystemInterface.getTab());
        buttons.create();
        UIElements select = new SelectionWindow(new JFrame("Ordering Client V1.0"), new JPanel(new GridLayout(2, 0)), new JPanel(new FlowLayout()), buttonsPanel, new JLabel("Thanks for choosing Big Everything as your dining choice! How can we help you?"));
        select.create();
    }
}