package application;

import javax.swing.*;

public class Imgshow {
    private JPanel panel1;
    private JSlider slider1;
    private JButton button1;
    private JTable table1;
    private JTextField textField1;

    public static void start() {
        JFrame frame = new JFrame("Imgshow");
        frame.setContentPane(new Imgshow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
