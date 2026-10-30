import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Q1 extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    Q1(){
        setTitle("Login Form");
        setLayout(new GridLayout(3,2,10,10));
        l1=new JLabel("UserName: ");
        l2=new JLabel("Password: ");
        t1=new JTextField();
        t2=new JPasswordField();
        b1=new JButton("Login");
        b2=new JButton("Reset");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(350,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            JOptionPane.showMessageDialog(this,"Login Button Clicked !!");
        }
        else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }
    }
    public static void main(String[] args) {
        new Q1();
    }
}

