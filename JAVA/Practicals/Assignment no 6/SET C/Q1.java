import javax.swing.*;
import java.awt.event.*;

class Q1 extends JFrame implements ActionListener
{
    JLabel l1;
    JComboBox<String> cb;
    JButton b1;

    Q1()
    {
        setTitle("ComboBox Example");
        setSize(550, 350);
        setLayout(null);

        l1 = new JLabel("Programming language Selected: Java");
        l1.setBounds(100, 50, 350, 30);
        add(l1);

        String languages[] = {"C", "C++", "C#", "Java", "PHP"};

        cb = new JComboBox<>(languages);
        cb.setSelectedItem("Java");
        cb.setBounds(70, 130, 130, 30);
        add(cb);

        b1 = new JButton("Show");
        b1.setBounds(290, 130, 110, 30);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String language = (String) cb.getSelectedItem();

        l1.setText("Programming language Selected: " + language);
    }

    public static void main(String args[])
    {
        new Q1();
    }
}