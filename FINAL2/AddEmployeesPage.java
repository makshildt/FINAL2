import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.*;

public class AddEmployeesPage extends JPanel {
    AddEmployeesPage() {
        JLabel AddEmpLabel = new JLabel("First Name:");
        add(AddEmpLabel);
        JTextField AddEmpTextField = new JTextField((10));
        add(AddEmpTextField);

        JLabel AddEmpLabel2 = new JLabel("Last Name:");
        add(AddEmpLabel2);
        JTextField AddEmpTextField2 = new JTextField((10));
        add(AddEmpTextField2);

        JLabel AddEmpLabel3 = new JLabel("Year of Birth:");
        add(AddEmpLabel3);
        JTextField AddEmpTextField3 = new JTextField((10));
        add(AddEmpTextField3);

        JLabel AddEmpLabel4 = new JLabel("Email:");
        add(AddEmpLabel4);
        JTextField AddEmpTextField4 = new JTextField((10));
        add(AddEmpTextField4);

        JLabel AddEmpLabel5 = new JLabel("Role:");
        add(AddEmpLabel5);
        JTextField AddEmpTextField5 = new JTextField((10));
        add(AddEmpTextField5);

        JComboBox AddEmpLabel6 = new JComboBox();
        AddEmpLabel6.addItem("Team 1");
        AddEmpLabel6.addItem("Team 2");
        AddEmpLabel6.addItem("Team 3");
        add(AddEmpLabel6);

        JButton AddEmpButton = new JButton("Submit");
        add(AddEmpButton);
        AddEmpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String AddEmpText = AddEmpTextField.getText();
                System.out.println(AddEmpText);
                AddEmpTextField.setText("");
                AddEmpTextField2.setText("");
                AddEmpTextField3.setText("");
                AddEmpTextField4.setText("");
                AddEmpTextField5.setText("");
            }
        });
    }
}

