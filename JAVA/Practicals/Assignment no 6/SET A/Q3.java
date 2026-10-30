import javax.swing.*;
import java.awt.event.*;

class Q3 extends JFrame implements ActionListener
{
    JTextArea ta;
    JLabel l1, l2;
    JButton b;

    Q3()
    {
        setTitle("Count words and characters");
        setSize(580, 370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        l1 = new JLabel("Words: 0");
        l1.setBounds(70, 30, 120, 25);
        add(l1);

        l2 = new JLabel("Characters: 0");
        l2.setBounds(240, 30, 180, 25);
        add(l2);

        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(25, 75, 450, 180);
        add(sp);

        b = new JButton("Count Words");
        b.setBounds(150, 275, 180, 35);
        add(b);

        b.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String text = ta.getText();

        int characters = text.length();
        String str = text.trim();
        int words = 0;

        if (!str.isEmpty())
        {
            words = str.split("\\s+").length;
        }

        l1.setText("Words: " + words);
        l2.setText("Characters: " + characters);
    }

    public static void main(String args[])
    {
        new Q3();
    }
}