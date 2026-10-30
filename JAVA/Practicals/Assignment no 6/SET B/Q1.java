import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q1 extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

    int attempts = 0;
    final String username = "admin";
    final String password = "1234";

    Q1()
    {
        setTitle("Login Form");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 10, 10));

        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");

        t1 = new JTextField();
        t2 = new JPasswordField();

        b1 = new JButton("Login");
        b2 = new JButton("Reset");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            if (attempts >= 3)
            {
                JOptionPane.showMessageDialog(this, "Login Failed");
                return;
            }

            String u = t1.getText();
            String p = new String(t2.getPassword());

            if (u.equals(username) && p.equals(password))
            {
                JOptionPane.showMessageDialog(this,
                    "Login successful");
                b1.setEnabled(false);
            }
            else
            {
                attempts++;

                if (attempts >= 3)
                {
                    JOptionPane.showMessageDialog(this,
                        "Login Failed");
                    b1.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,
                        "Username or Password is incorrect");
                }
            }
        }
        else if (e.getSource() == b2)
        {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String args[])
    {
        new Q1();
    }
}