package Assignment6;
import javax.swing.*;

public class UI {
        // TODO: The user interface should just be a text-based numbered list of options, implemented in the main method. (It can be a GUI if you desire and are familiar with the development of GUIs, but no extra points will be given for this).        
    public static void main(String[] args){
       JFrame frame = new JFrame("Ordering Client V1.0");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JLabel label = new JLabel("Hello World!");
       label.setHorizontalAlignment(SwingConstants.CENTER);
       frame.getContentPane().add(label);
       frame.setVisible(true);
    }
}