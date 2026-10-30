import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q2 extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5;

    Q2()
    {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number:");
        l3 = new JLabel("Result:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        b1 = new JButton("Addition");
        b2 = new JButton("Subtraction");
        b3 = new JButton("Multiplication");
        b4 = new JButton("Division");
        b5 = new JButton("Reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if (e.getSource() == b5)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                return;
            }

            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == b1)
                result = a + b;
            else if (e.getSource() == b2)
                result = a - b;
            else if (e.getSource() == b3)
                result = a * b;
            else if (e.getSource() == b4)
            {
                if (b == 0)
                {
                    JOptionPane.showMessageDialog(this,
                        "Cannot divide by zero!");
                    return;
                }
                result = a / b;
            }

            t3.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this,
                "Please enter valid numbers.");
        }
    }

    public static void main(String args[]){
        new Q2();}
    
}