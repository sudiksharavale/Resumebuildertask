import java.awt.*;
import javax.swing.*;

class MyResume extends JFrame {
    MyResume() {

        setLayout(new BorderLayout());
        JLabel l1 = new JLabel("Task - 1");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        jp2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel l2 = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        jp2.add(l2, gbc);

        JTextField t2 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        jp2.add(t2, gbc);

        JLabel l3 = new JLabel("DOB:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        jp2.add(l3, gbc);

        JTextField t3 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        jp2.add(t3, gbc);

        JLabel l4 = new JLabel("GENDER:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        jp2.add(l4, gbc);

        JRadioButton r1 = new JRadioButton("Male");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        jp2.add(r1, gbc);

        JRadioButton r2 = new JRadioButton("Female");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        jp2.add(r2, gbc);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l5 = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        jp2.add(l5, gbc);

        JTextArea ta1 = new JTextArea(10, 20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        jp2.add(ta1, gbc);

        JLabel l6 = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        jp2.add(l6, gbc);

        JTextField t4 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        jp2.add(t4, gbc);

        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Save");
        JButton b3 = new JButton("Cancel");
        JButton b4 = new JButton("RESET");

        jp1.setLayout(new FlowLayout());
        jp3.setLayout(new FlowLayout());

        jp1.add(l1);

        jp3.add(b1);
        jp3.add(b2);
        jp3.add(b3);
        jp3.add(b4);

        add(jp1, BorderLayout.NORTH);
        add(jp2, BorderLayout.CENTER);
        add(jp3, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new MyResume();
    }
}
