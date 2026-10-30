import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q2 extends JFrame implements ActionListener
{
    JLabel title, nameLabel, doseLabel, vaccineLabel;
    JLabel resultName, resultDose1, resultDose2, resultVaccine;

    JTextField nameField;

    JCheckBox dose1, dose2;

    JRadioButton covishield, covaxin, sputnik;

    JButton submit;

    Q2()
    {
        setTitle("Vaccination Details");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        // Title
        title = new JLabel("Vaccination Details", JLabel.CENTER);
        add(title, BorderLayout.NORTH);

        // Main panel
        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        // Dose panel
        JPanel dosePanel = new JPanel(new GridLayout(3, 1));
        doseLabel = new JLabel("Dose");
        dose1 = new JCheckBox("1st Dose");
        dose2 = new JCheckBox("2nd Dose");

        dosePanel.add(doseLabel);
        dosePanel.add(dose1);
        dosePanel.add(dose2);

        // Vaccine panel
        JPanel vaccinePanel = new JPanel(new GridLayout(4, 1));
        vaccineLabel = new JLabel("Vaccine");

        covishield = new JRadioButton("Covishield");
        covaxin = new JRadioButton("Covaxin");
        sputnik = new JRadioButton("Sputnik V");

        ButtonGroup group = new ButtonGroup();
        group.add(covishield);
        group.add(covaxin);
        group.add(sputnik);

        vaccinePanel.add(vaccineLabel);
        vaccinePanel.add(covishield);
        vaccinePanel.add(covaxin);
        vaccinePanel.add(sputnik);

        mainPanel.add(dosePanel);
        mainPanel.add(vaccinePanel);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(submit, BorderLayout.CENTER);

        // Result panel
        JPanel resultPanel = new JPanel(new GridLayout(2, 1));
        resultPanel.setBorder(
            BorderFactory.createTitledBorder("Vaccination Summary"));

        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

        resultName = new JLabel("Name: ");
        resultDose1 = new JLabel("1st Dose: ");
        resultDose2 = new JLabel("2nd Dose: ");

        row1.add(resultName);
        row1.add(resultDose1);
        row1.add(resultDose2);

        resultVaccine = new JLabel("Vaccine: ");

        resultPanel.add(row1);
        resultPanel.add(resultVaccine);

        add(mainPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Display summary in a separate dialog when submitted
        submit.addActionListener(e -> {
            String doses = "";

            if (dose1.isSelected())
                doses += "1st Dose ";

            if (dose2.isSelected())
                doses += "2nd Dose";

            String vaccine = "";

            if (covishield.isSelected())
                vaccine = "Covishield";
            else if (covaxin.isSelected())
                vaccine = "Covaxin";
            else if (sputnik.isSelected())
                vaccine = "Sputnik V";

            JOptionPane.showMessageDialog(this,
                "Name: " + nameField.getText()
                + "\nDose: " + doses
                + "\nVaccine: " + vaccine);
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {}

    public static void main(String args[])
    {
        new Q2();
    }}
